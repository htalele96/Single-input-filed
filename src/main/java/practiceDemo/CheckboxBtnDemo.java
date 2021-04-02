package practiceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxBtnDemo {
	
	
	public void clickCheckbox(WebDriver driver, String checkBoxId) {
		WebElement checkbox=driver.findElement(By.id(checkBoxId));	
		checkbox.click();
	}
	
	public boolean isCheckBoxSelected(WebDriver driver, String checkBoxId) {
		WebElement checkbox=driver.findElement(By.id(checkBoxId));	
		boolean boxChecked=	checkbox.isSelected();
		return boxChecked;
	}
	
	
	public String outputField(WebDriver driver,String outputFieldId) {
		WebElement msg=driver.findElement(By.id(outputFieldId));
		return msg.getText(); 
	}
	
	

}
