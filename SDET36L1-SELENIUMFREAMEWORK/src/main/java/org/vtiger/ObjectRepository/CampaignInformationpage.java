package org.vtiger.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genericUsability.UtilityObjectClass;

public class CampaignInformationpage 
{
	public CampaignInformationpage()
	{
		PageFactory.initElements(UtilityObjectClass.getDriver(), this);
	}
	@FindBy(xpath = "//span[@id='dtlview_Campaign Name']")
	private WebElement actualCampaignNameText;
	
	//Business Library
	
	/**
	 * This method is used to click on the create campaign button
	 * @return
	 */
	public String getActualCampaignName()
	{
		return actualCampaignNameText.getText();
	}

}
