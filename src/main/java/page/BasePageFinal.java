package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePageFinal {
	
	public void selectDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public int generateNumber(int bound) {
		Random rnd = new Random();
		int generateNumber = rnd.nextInt(bound);
		return generateNumber;
	}
}
