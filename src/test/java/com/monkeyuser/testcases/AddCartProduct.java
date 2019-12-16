package com.monkeyuser.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class AddCartProduct extends TestBase{
	
	@Test
	public void AddCart() {
		
		driver.findElement(By.xpath("//a[contains(text(),'SHOP')]")).click();
	
		driver.findElement(By.cssSelector("#shopify-section-featured-collections > div > ul > li:nth-child(2) > div > a")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		driver.findElement(By.xpath("//input[@name='checkout']")).click();
		
		
	}

}
