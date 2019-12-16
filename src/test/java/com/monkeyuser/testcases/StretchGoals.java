package com.monkeyuser.testcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.monkeyuser.base.TestBase;

public class StretchGoals extends TestBase {
//Stretch Goals: Modify the automation to accept any list of dates, and verify that there are or are not comic on those dates
	
	@Test
	public void SpecificDatesComics() {
		driver.findElement(By.cssSelector("body > div.content > div > div > header > a > img")).click();
		driver.findElement(By.xpath("//span[@class='site-nav__label'][contains(text(),'Comics')]")).click();
		driver.findElement(By.xpath("//*[@id=\"list\"]")).click(); // Clicks 'Comic List'

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter date to verify if comic exists: ");

		String str = sc.next();

		if (driver.getPageSource().contains(str))
			System.out.println("Got lucky!! Found matching comic on this date");
		else
			System.out.println("Unfortunately, there are no matching comics present on this date");

	}
}
