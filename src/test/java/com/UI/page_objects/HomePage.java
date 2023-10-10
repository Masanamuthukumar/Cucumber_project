package com.UI.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//a[@href=\"/web/index.php/directory/viewDirectory\"]")
	public static WebElement DIRECTORY;
}
