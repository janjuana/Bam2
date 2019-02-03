package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtils.BaseClass;

public class TraditionalStats extends BaseClass {
	
	@FindBy(xpath="//nav[@class='nav-inner__menu nav-inner__menu--left']//div[1]")
	public WebElement nbaStatBar;
	
	@FindBy(xpath="//select[@name='Season']")
	public WebElement season;
	
	@FindBy(xpath="//select[@name='PerMode']")
	public WebElement selectMode;
	
	@FindBy(xpath="//option[@value='object:37']")
	public WebElement total;
	
	@FindBy(xpath="//div[@class='stats-table-pagination__inner stats-table-pagination__inner--top']//select[@class='stats-table-pagination__select ng-pristine ng-untouched ng-valid ng-not-empty']")
	public WebElement pages;
	
	@FindBy(xpath="//div[@class='stats-table-pagination__inner stats-table-pagination__inner--top']//option[@value='string:All'][contains(text(),'All')]")
	public WebElement all;
	

	public TraditionalStats() {
		PageFactory.initElements(driver, this);

	}
}
