package com.example.api;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import pages.Login;
@SpringBootTest
class ApiApplicationTests {

	@Test
	void contextLoads() {
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Login obj=new Login(driver);
		obj.intialize();
		obj.loginAction(id);
	}

}
