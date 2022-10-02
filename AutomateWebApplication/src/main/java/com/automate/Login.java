package com.automate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JASHWANTH\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/login/");
		
		
		
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email_login"));
		email.sendKeys("jaswanth@gmail.com");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Allu@07");
		
		//button
		WebElement login= driver.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();
}
}
