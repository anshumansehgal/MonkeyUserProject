package com.monkeyuser.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class ComicsSpecificDates extends TestBase{
	
	@Test
	public void SpecificDatesComics() {
		
		driver.findElement(By.xpath("//*[@id=\"list\"]")).click(); //Clicks 'Comic List'
		
		//December 4, 2018
		driver.findElement(By.cssSelector("body > div.content-container > div.page > div > div > div:nth-child(47) > div > div > a.image-title")).click();
		
		//June 19, 2018
		driver.navigate().back();
		driver.findElement(By.cssSelector("body > div.content-container > div.page > div > div > div:nth-child(67) > div > div > a.image-title")).click();
		
		//May 30, 2017
		driver.navigate().back();
		driver.findElement(By.cssSelector("body > div.content-container > div.page > div > div > div:nth-child(117) > div > div > a.image-title")).click();
		
	}

}
