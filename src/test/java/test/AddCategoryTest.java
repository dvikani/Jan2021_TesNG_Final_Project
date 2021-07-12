package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToAddCategory() throws InterruptedException {
		driver = BrowserFactory.inti();
		
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.insertCategoryName("FinalExam21");
		addCategoryPage.clickOnAddCategoryButton();
		
		
		
	}
}
