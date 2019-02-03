package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TraditionalStats;
import testUtils.BaseClass;
import testUtils.CommonMethods;

public class GetStats extends BaseClass {

	TraditionalStats traditionalStats;

	@Given("^I go to Nba\\.com/stats$")
	public void i_go_to_Nba_com_stats() throws Throwable {
	}

	@When("^I choose traditional stats$")
	public void i_choose_traditional_stats() throws Throwable {
		for (int q = 8; q < 14; q++) {
			driver.findElement(By.xpath("//select[@name='Season']")).click();
			driver.findElement(By.xpath("//option[@value='object:" + q + "']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//select[@name='PerMode']")).click();
			driver.findElement(By.xpath("//option[@value='object:20']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//div[@class='stats-table-pagination__inner stats-table-pagination__inner--top']//select[@class='stats-table-pagination__select ng-pristine ng-untouched ng-valid ng-not-empty']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//div[@class='stats-table-pagination__inner stats-table-pagination__inner--top']//option[@value='string:All'][contains(text(),'All')]"))
					.click();
			Thread.sleep(2000);
			String xlPath = "C:/Users/Dell/Desktop/ShootingEfficiency.xlsx";
			int rowCount = driver.findElements(By.xpath("//div[@class='nba-stat-table__overflow']//tbody//tr")).size();
			int colsCount = driver.findElements(By.xpath("//div[@class='nba-stat-table__overflow']//tbody//tr[1]//td"))
					.size();

			FileInputStream fis = new FileInputStream(xlPath);

			XSSFWorkbook wkb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wkb.createSheet("Sheet" + q + "");

			for (int i = 1; i <= rowCount; i++) {
				XSSFRow row = sheet1.createRow(i);
				{
					for (int j = 1; j <= colsCount; j++) {
						WebElement enterValues = driver.findElement(By
								.xpath("//div[@class='nba-stat-table__overflow']//tbody//tr[" + i + "]/td[" + j + "]"));
						String text = enterValues.getText();
						XSSFCell textCell = row.createCell(j - 1);
						textCell.setCellValue(text);
					}
				}

			}
			FileOutputStream fos = new FileOutputStream(xlPath);
			wkb.write(fos);
			fos.close();
		}
	}
	

	@Then("^I quit$")
	public void i_quit() throws Throwable {
		driver.quit();
	}

}