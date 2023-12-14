package page;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class Projctage {
	
 WebDriver driver;
By specility=By.xpath("//*[@id=\"edit-speciality-find-doctor\"]");
By option=By.xpath("/html/body/div[1]/div[4]/main/div/div/div[2]/article/div/div/div/div[2]/div[2]/div/div/form/div[1]/div/div/ul/li[2]");
By doctor=By.xpath("//*[@id=\"edit-doctor-find-doctor\"]");
By options=By.xpath("/html/body/div[1]/div[4]/main/div/div/div[2]/article/div/div/div/div[2]/div[2]/div/div/form/div[2]/div/div/ul/li");
By search=By.xpath("//*[@id=\"find-doctor-hospital-submit\"]");
By docimg=By.xpath("//*[@id=\"block-aster-content\"]/article/div[1]/div/div[1]/div[1]/div/div/picture/img");
By dctn=By.xpath("//*[@id=\"block-aster-content\"]/article/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/a");
By maps=By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[3]/div/div/button[2]/div[2]/div[2]");
By numb=By.xpath("//*[@id=\"block-aster-content\"]/article/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div[2]");
By hrt=By.xpath("//*[@id=\"block-views-block-aster-centres-of-excellence-block-2--2\"]/div/div/div[2]/div/div/div/ul/li[2]/div/a");
By pls=By.xpath("//*[@id=\"block-views-block-coe-details-child-facilities--2\"]/div/div/div/div[3]/div[1]/i[1]");
By headspl=By.xpath("//*[@id=\"block-headerprimarymenu\"]/div/nav/div/ul/li[2]");
By slctdrop=By.xpath("/html/body/div[1]/header/nav/div/div[3]/div/div/nav/div/ul/li[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/span/a");
By procedure=By.xpath("//*[@id=\"block-specialityheader\"]/div/div/div[5]/a");
By mse=By.xpath("//*[@id=\"block-views-block-coe-details-child-services--2\"]/div/div/div/div/div/div/div/ul/li[2]/div/a");
By book=By.xpath("/html/body/div[1]/header/nav/div/div[3]/div/div/nav/div/ul/li[3]/a");
By check=By.xpath("//*[@id=\"hospital-1678\"]");
By gas=By.xpath("/html/body/div[1]/div[5]/aside/div/div[2]/div/ul/li[13]");
By slctbox=By.xpath("//*[@id=\"edit-hospital\"]");
By limage=By.xpath("//*[@id=\"block-aster-branding\"]/a/img");
By name=By.xpath("//*[@id=\"edit-first-name\"]");
By lname=By.xpath("//*[@id=\"edit-last-name\"]");
By mail=By.xpath("//*[@id=\"edit-email\"]");
By mobile=By.xpath("//*[@id=\"edit-phone-number\"]");
By drname=By.xpath("/html/body/div[1]/div[5]/main/div/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/a");
By date1=By.xpath("//*[@id=\"appPpAppS_l_0_slot1a_0\"]/div");
By datea=By.xpath("//*[@id=\"appPpAppS_npL_0_link\"]/span/div");
By feeds=By.xpath("//*[@id=\"block-header-secondary-menu\"]/ul/li[4]/a");
By feedfst=By.xpath("//*[@id=\"edit-first-name--2\"]");
By feedlst=By.xpath("//*[@id=\"edit-last-name--2\"]");
By feedml=By.xpath("//*[@id=\"edit-email--2\"]");
By feednm=By.xpath("//*[@id=\"edit-mobile-number--2\"]");
By unit=By.xpath("//*[@id=\"edit-unit-name--2\"]");
By cmnt=By.xpath("//*[@id=\"edit-comments--2\"]");
By type=By.xpath("//*[@id=\"edit-type--2\"]");
By cap=By.xpath("//*[@id=\"recaptcha-anchor\"]");
By opunit=By.xpath("//*[@id=\"edit-unit-name--2\"]/option[7]");
By notif=By.xpath("//*[@id=\"appPpAppS_l_0_slot\"]/div[1]/div/div/div");


public Projctage(WebDriver driver) {
	this.driver=driver;
}
public void back() {
	driver.navigate().back();
}
public void scrollup() {
	JavascriptExecutor up=(JavascriptExecutor)driver;
	up.executeScript("window.scrollBy(0,-2000)","");
}
public void scrollby() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1200)", "");
}
public void scroll() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)", "");
}
public void scrolling() {
	JavascriptExecutor jv=(JavascriptExecutor)driver;
	jv.executeScript("window.scrollBy(0,1500)", " ");
	
}
public void waiting() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
}
public void title() {
	String expected="Best Hospital In Calicut, Kerala - Aster MIMS";
	String actual=driver.getTitle();
	System.out.println("the title is "+actual);
	if(actual.equals(expected)) {
		System.out.println("title as expected");
	}
	else {
		System.out.println("title is different");
	}
}
public void logo() {
	boolean logoimg=driver.findElement(limage).isDisplayed();
	if(logoimg) {
		System.out.println("logo is present");
	}
	else
		System.out.println("no logo");
}

public void search(String splt) {
	driver.findElement(specility).sendKeys(splt);
	}
public void rslt() {
	try {
	driver.findElement(option).click();
}
     catch(StaleElementReferenceException Exception) {
	driver.findElement(option).click();
     }}

public void search2(String docs) {
	driver.findElement(doctor).sendKeys(docs);
}
public void rslt2() {
	try {
	driver.findElement(options).click();
	}
	catch(StaleElementReferenceException Exception) {
		driver.findElement(options).click();
	}
}
public void button() {
	driver.findElement(search).click();
}
public void image() {
	boolean im=driver.findElement(docimg).isDisplayed();
	if(im) {
		System.out.println("the image is displayed ");
	}
	else {
		System.out.println("the image is not displayed");
	}
}
public void address() {
	String address="Malabar Institute of Medical Sciences Ltd. Mini By-pass Road;";
	String add=driver.getPageSource();
	if(add.contains(address)) {
		System.out.println("address is same as expected");
	}
	else {
		System.out.println("address is different from expected");
	}
}
public void direction() {
	driver.findElement(dctn).click();
}
public void save() {
	driver.findElement(maps).click();
}
public void review() {
	driver.findElement(maps).click();
}
public void btntext() {
	String bton=driver.findElement(dctn).getAttribute("href");
	System.out.println("the direction link is "+ bton);	
}
public void mobile() {
	String number=driver.findElement(numb).getText();
	System.out.println(number);
}
public void heart() {
	driver.findElement(hrt).click();
}
public void plus() {
	driver.findElement(pls).click();
}
public void specialities() {
	driver.findElement(headspl).click();
}
public void enquiry(String fnme,String lnme,String gmail, String num) {
	driver.findElement(name).sendKeys(fnme);
	driver.findElement(lname).sendKeys(lnme);
	driver.findElement(mail).sendKeys(gmail);
	driver.findElement(mobile).sendKeys(num);
	
}
public void drop() {
	
	driver.findElement(slctdrop).click();
	}
public void treatment() {
	driver.findElement(procedure).click();
}
public void mouse() {
	WebElement hover=driver.findElement(mse);
	Actions act=new Actions(driver);
	act.moveToElement(hover);
}
public void booking() {
	driver.findElement(book).click();
}

public void checkbox() {
	boolean checktick=driver.findElement(check).isSelected();
	if(checktick) {
		System.out.println("aster mims calicut is selected ");
	}
	else {
		System.out.println("checkbox is not selected");
	}
	
}
public void section() {
	driver.findElement(gas).click();
	
}
public void Profname() {
	try {
	driver.findElement(drname).click();
	}
	catch(StaleElementReferenceException Exception) {
		driver.findElement(drname).click();
	}
}


	
public void feedback() {
	driver.findElement(feeds).click();
}
public void values2(String first,String last,String email,String number,String comment ){
	driver.findElement(feedfst).sendKeys(first);
	driver.findElement(feedlst).sendKeys(last);
	driver.findElement(feedml).sendKeys(email);
	driver.findElement(feednm).sendKeys(number);
	driver.findElement(cmnt).sendKeys(comment);
	
}
public void unites() {
	String op1=driver.findElement(opunit).getText();
	
	WebElement branch=driver.findElement(unit);
	Select src=new Select(branch);
	src.selectByVisibleText(op1);
}
public void types() {
	WebElement kind=driver.findElement(type);
	Select scr=new Select(kind);
	scr.selectByVisibleText("Compliments");
}

}
