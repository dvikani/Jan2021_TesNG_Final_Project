package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Test 1: Validate a user is able to add a category and once the category is added it should display.

public class AddCategoryPage extends BasePageFinal {

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	

	
	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']") WebElement CATEGORY_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']") WebElement ADD_CATEGORY_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//body") WebElement CATEGORY_EXISTS_LOCATOR;
	
	
	public void insertCategoryName(String categoryName) {
		CATEGORY_NAME_LOCATOR.sendKeys(categoryName + generateNumber(999));
	}
	public void clickOnAddCategoryButton() {
		ADD_CATEGORY_BUTTON_LOCATOR.click();
	}
	public void validateUserIsNotAbleToAddDuplicatedCategory() {
		String displayMessage = "The category you want to add already exists: \r\n"
				+ "\r\n"
				+ "		";
		
	}
}
