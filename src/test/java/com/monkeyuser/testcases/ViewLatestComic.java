package com.monkeyuser.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class ViewLatestComic extends TestBase{
	
	@Test
	public void LatestComic() {
		
		driver.findElement(By.cssSelector("#list")).click();
		
	}
	
	

}
