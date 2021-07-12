package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidateMonthDropDownPage;
import util.BrowserFactory;

public class ValidateMonthDropDownTest {
	

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToSelectMonth() throws InterruptedException {
		driver = BrowserFactory.inti();
		
		
		ValidateMonthDropDownPage selectMonth = PageFactory.initElements(driver, ValidateMonthDropDownPage.class);
		selectMonth.insertMonth("Jul");
		
	}
}
