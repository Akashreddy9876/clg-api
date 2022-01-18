package com.example.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class Login {
	// final WebDriver driver;

	// public Login(WebDriver driver) {
	// this.driver = driver;
	// PageFactory.initElements(driver, this);
	// }

	@FindBy(id = "txtId3")
	WebElement id;
	@FindBy(id = "txtPwd3")
	WebElement pass;
	@FindBy(id = "imgBtn3")
	WebElement button;

	public String intialize() {
		// driver.get("http://webprosindia.com/avnit/");
		return "DRIVER HAS BEEN INITIALIZED";
	}

	public String loginAction(String idno, String pass) {
		id.sendKeys(idno);
		pass.sendKeys(pass);
		button.click();

		return "LOGIN HAS BEEN PERFORMED WITH : " + idno;
	}

	public String getFeeDetails() {
		return "FEE DETAILS";
	}

	public String studentDetails(String idno) {
		return "GET THE STUDENT DETAILS";
	}
}
