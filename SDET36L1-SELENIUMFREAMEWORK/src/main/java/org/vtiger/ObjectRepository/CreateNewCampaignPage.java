package org.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genericUsability.UtilityObjectClass;

public class CreateNewCampaignPage 
{
	public CreateNewCampaignPage()
	{
		PageFactory.initElements(UtilityObjectClass.getDriver(), this);
	}
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignNammeTextField;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Business Library
	
	/**
	 * This method is used to click on the create campaign button
	 * @param expectedCampaignname
	 */
	public void createCampaign(String expectedCampaignname)
	{
		campaignNammeTextField.sendKeys(expectedCampaignname);
		saveBtn.click();
	}

}
