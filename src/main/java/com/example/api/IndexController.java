package com.example.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    public Login obj;

    IndexController() {
        // System.setProperty("webdriver.chrome.driver",
        // "C:\\Users\\akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        Login obj = new Login();
        System.out.println(obj.intialize());
    }

    @RequestMapping(value = "/api/fee", params = { "hallticket", "pass" })
    public String feeDetails(@RequestParam Map<String, String> params) {

        this.obj.loginAction(params.get("hallticket"), params.get("pass"));
        return this.obj.getFeeDetails();
    }

    @RequestMapping(value = "/api")
    public String apiIntro() {
        return "The driver has been initialized. Start sending requests";
    }
}
