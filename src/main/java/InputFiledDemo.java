import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFiledDemo {
	
	public void inputField(WebDriver driver,String input,String inputFieldId) {
		WebElement msg=driver.findElement(By.id(inputFieldId));
		msg.sendKeys(input);
		
	}
	
	public void clickButton(WebDriver driver, String buttonXpath ) {
		
		 driver.findElement(By.xpath(buttonXpath)).click();
		//msg.click();

		
	}
	
	public String outputField(WebDriver driver,String outputFieldId) {
		WebElement msg=driver.findElement(By.id(outputFieldId));
		return msg.getText(); 
	}
	
	public String outputFieldByClassName(WebDriver driver,String outputFieldClassName) {
		WebElement msg=driver.findElement(By.className(outputFieldClassName));
		return msg.getText(); 
	}
}
