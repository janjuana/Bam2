package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class fafa {
	File file = new File("C:/Users/DELL/Desktop/stats.xlsx");
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheet("Sheet1");
	XSSFRow row;

	for (int i = 1; i < rowsize; i++) {
		WebElement webCols = cols.get(i);
		WebElement webRow = rows.get(i);
		
		if (allCells.size() > 1) {
			XSSFRow excelRow = sheet1.createRow(i);
			for (int j = 1; j < allCells.size(); j++) {
				WebElement webCell = allCells.get(j);
				String text = webCell.getText();
				Cell excelCell = excelRow.createCell(j);
				excelCell.setCellValue(text);

			}
		}
	}
}
}
