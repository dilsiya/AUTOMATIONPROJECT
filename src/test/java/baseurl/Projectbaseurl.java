package baseurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

public class Projectbaseurl {
public WebDriver driver;
@BeforeClass
public void baseclass() {
	
	driver=new ChromeDriver();
	driver.get("https://www.asterhospitals.in/hospitals/aster-mims-calicut");
	driver.manage().window().maximize();
	
}
}
