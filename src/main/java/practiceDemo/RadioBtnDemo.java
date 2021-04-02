package practiceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioBtnDemo {
	
	public void clickRadioBtn(WebDriver driver, String radioGroupName, String radioBtnName) {
		
		List<WebElement>  radioBtns= driver.findElements(By.name((radioGroupName)));
		
		for (WebElement radioBtn : radioBtns) {
			String radioBtnValue = radioBtn.getAttribute("value");
			if(radioBtnValue.equals(radioBtnName)) {
				radioBtn.click();
			}
			
		}
	}
	

}
