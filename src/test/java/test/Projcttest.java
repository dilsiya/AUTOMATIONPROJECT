package test;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseurl.Projectbaseurl;
import page.Projctage;

public class Projcttest extends Projectbaseurl{
@Test
public void test() {

	Projctage pt=new Projctage(driver);
	pt.title();
	pt.logo();
	pt.scroll();
    pt.search("ortho");
    pt.waiting();
	pt.rslt();
	pt.search2("sub");
	pt.waiting();
	pt.rslt2();
	pt.button();
	pt.image();
    pt.back();
	pt.scroll();
	String current=driver.getWindowHandle();
	pt.btntext();
	pt.direction();
	Set<String> newwindow=driver.getWindowHandles();
	for(String handle:newwindow) {
	if(!handle.equalsIgnoreCase(current)) {
		driver.switchTo().window(handle);
	    pt.review();
	    pt.scroll();
	    pt.waiting();
	    driver.switchTo().window(current);
}}
	
   pt.address();
   pt.scroll();
   pt.mobile();
   pt.scrolling();
   pt.heart();
   pt.scrolling();
   pt.plus();
   pt.waiting();
   pt.back();
   pt.scrollup();
   pt.specialities();
   pt.waiting();
   pt.drop();
   pt.enquiry("dilsiya", "a", "dilsiya@gmail.com", "9345678901");
   pt.scroll();
   pt.treatment();
   pt.mouse();
   pt.back();
   pt.back();
   pt.booking();
   pt.waiting();
   pt.scroll();
   pt.checkbox();
   pt.section();
   pt.waiting();
   pt.scroll();
   pt.Profname();
   pt.waiting();
   pt.back();
   pt.back();
   pt.back();
   pt.feedback();
   pt.values2("dil", "siya", "dilsiya@gmail.com", "9076854327","good service");
   pt.waiting();
   pt.unites();
   pt.waiting();
   pt.types();
   pt.waiting();
  
	}}

     
     
     
     
     
     
     
     
     
     
     
     


