package com.monkeyuser.testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class ViewRandomComic extends TestBase {
		
		@Test
		public void RandomComic() {
			
			driver.findElement(By.cssSelector("body > div.content-container > div.list > div.page-navigation > div > div.thumb.random.nobefore > a")).click();
			
		}
		

	}

		

	
