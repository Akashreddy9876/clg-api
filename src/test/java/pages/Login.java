package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
public class Login {
final WebDriver driver;
public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this); 
	}
@FindBy(id="txtId3")
WebElement id;
@FindBy(id="txtPwd3")
WebElement pass;
@FindBy(id="imgBtn3")
WebElement button;
public void intialize() {
	driver.get("http://webprosindia.com/avnit/");
}
public void loginAction(String idno) {
	id.sendKeys(idno);
	pass.sendKeys("webcap");
	button.click();
	}	
}
