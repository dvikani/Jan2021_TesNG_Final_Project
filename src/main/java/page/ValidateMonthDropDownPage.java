package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//Test 3: Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
public class ValidateMonthDropDownPage extends BasePageFinal{
	
	WebDriver driver;

	public ValidateMonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']") WebElement MONTHS_LOCATOR;
	
	public void insertMonth(String months) {
		selectDropdown (MONTHS_LOCATOR, months);
	}
}
