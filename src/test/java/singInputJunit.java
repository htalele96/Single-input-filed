import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import practiceDemo.Browser;
import practiceDemo.CheckboxBtnDemo;
import practiceDemo.RadioBtnDemo;

public class singInputJunit {

	@Test
	public void singleInputFieldDemo() {
		Browser browser = new Browser();
		WebDriver driver=browser.goToUrl("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		InputFiledDemo input1=new InputFiledDemo();
		input1.inputField(driver,"Welcome to selemnium Demo","user-message");
		input1.clickButton(driver,"//*[@id=\"get-input\"]/button");
		String finalmsg=input1.outputField(driver,"display");
		Assert.assertEquals("Welcome to selemnium Demo", finalmsg);
		
	 }
	 

	
	@SuppressWarnings("deprecation")
	@Test
	public void singleCheckboxDemo() {
		Browser browser = new Browser();
		WebDriver driver=browser.goToUrl("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		CheckboxBtnDemo checkbox1=new CheckboxBtnDemo();
		checkbox1.clickCheckbox(driver,"isAgeSelected");
		//boolean  isChecked = checkbox1.isCheckBoxSelected(driver, "isAgeSelected");
		//Assert.assertEquals(true, isChecked);
		//Assert.assertTrue(isChecked);
		
		InputFiledDemo seleniumEasyDemo = new InputFiledDemo();
		String outputMsg  = seleniumEasyDemo.outputField(driver, "txtAge");
		Assert.assertEquals("Success - Check box is checked", outputMsg);

	}
	
	
	
	@Test
	public void testTwoInputField() {
		Browser browser = new Browser();
		WebDriver driver=browser.goToUrl("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		InputFiledDemo input1=new InputFiledDemo();
		input1.inputField(driver,"10","sum1");
		input1.inputField(driver,"30","sum2");
		input1.clickButton(driver,"//*[@id=\"gettotal\"]/button");
		String finalmsg=input1.outputField(driver,"displayvalue");
		Assert.assertEquals("40", finalmsg);
		
	 }
	
	
	@Test
	public void testRadioBtnDemo () {
		Browser browser = new Browser();
		WebDriver driver=browser.goToUrl("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		RadioBtnDemo radioBtnDemo= new RadioBtnDemo();
		radioBtnDemo.clickRadioBtn(driver, "optradio", "Female");
		
		InputFiledDemo inputfiledDemo=new InputFiledDemo();
		inputfiledDemo.clickButton(driver, "//*[@id=\"buttoncheck\"]");
		String outputMsg =inputfiledDemo.outputFieldByClassName(driver,"radiobutton" );
		Assert.assertEquals("Radio button 'Female' is checked",outputMsg);
		
	}
	 
}


