package com.monkeyuser.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class ComicHistory extends TestBase{
	
	@Test
	public void HistoryComic() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'ABOUT')]")).click();
		
	}

}
