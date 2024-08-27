package week.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmSfaLink.click();
		WebElement account = driver.findElement(By.linkText("Accounts"));
		account.click();
		WebElement createAccount = driver.findElement(By.linkText("Create Account"));
		createAccount.click();
		WebElement accountName = driver.findElement(By.id("accountName"));
		accountName.sendKeys("Sivaram3");
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("Selenium Automation Tester.");
		WebElement numberEmployees = driver.findElement(By.id("numberEmployees"));
		numberEmployees.sendKeys("10");
		WebElement siteName = driver.findElement(By.id("officeSiteName"));
		siteName.sendKeys("LeafTaps");
		WebElement submit = driver.findElement(By.className("smallSubmit"));
		submit.click();
		String title = driver.getTitle();
		//System.out.println(title);
		String expectedTitle = "Account Details | opentaps CRM";
		if (title.equals(expectedTitle)) {
			System.out.println("Title Verification is success");
		} else {
			System.out.println("Title Verification is failed");
		}
	}

}
