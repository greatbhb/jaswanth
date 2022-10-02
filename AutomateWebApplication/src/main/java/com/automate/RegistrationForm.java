
package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\JASHWANTH\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("jaswanth");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("Triangle@gmail.com");  
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9676654688");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Allu@0707");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
}
}


