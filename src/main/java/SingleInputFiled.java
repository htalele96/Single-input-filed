import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleInputFiled {
	static WebDriver driver=null;
	
	public void goTo() {
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	}
	
	public void inputFiled(String input) {
		WebElement msg=driver.findElement(By.id("user-message"));
		msg.sendKeys(input);
	}
	
	public void showmsg() {
		
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"get-input\"]/button,")).click();

		this.outputFiled();
	}
	
	public String outputFiled() {
		WebElement msg=driver.findElement(By.id("display"));
		return msg.getText(); 
	}
	
}
