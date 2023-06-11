package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement dd1 = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select (dd1);
		s.selectByVisibleText("21");
		WebElement dd2 = driver.findElement(By.xpath("(//select)[2]"));
		Select s1 = new Select (dd2);
		s1.selectByIndex(0);
		WebElement dd3 = driver.findElement(By.xpath("(//select)[3]"));
		Select s2 = new Select(dd3);
		s2.selectByValue("1999");
	}

}
