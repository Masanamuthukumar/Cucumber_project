package com.UI.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {

	@FindBy(xpath="(//div[@class=\"oxd-select-text-input\"])[1]")
	public static WebElement JOB_TITLE;
}
