package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void lanchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void lanchUrl(String Url) {
		driver.get(Url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement ele) {
		ele.click();
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File image = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("location+imgname.pathName");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragWebElement, WebElement droElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, droElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarWebElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebElement);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
		File f = new File("C:\\Users\\HOME\\eclipse-workspace\\Maven1DataDriven\\Excel\\newfile1.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("element");
		Row r = newsheet.createRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createCell(int creRow, int creCell, String newdata) throws IOException {
		File f = new File("C:\\Users\\HOME\\eclipse-workspace\\Maven1DataDriven\\Excel\\newfile1.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("element");
		Row r = newsheet.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createrow(int creRow, int creCell, String newdata) throws IOException {
		File f = new File("C:\\Users\\HOME\\eclipse-workspace\\Maven1DataDriven\\Excel\\newfile1.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("element");
		Row r = newsheet.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void updateDataToParticularcell(int gettheRow, int gettheCell, String exsitingData,
			String writeNewdata) throws IOException {
		File f = new File("C:\\Users\\HOME\\eclipse-workspace\\Maven1DataDriven\\Excel\\newfile1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet newsheet = wb.createSheet("Datas");
		Row r = newsheet.createRow(gettheRow);
		Cell c = r.createCell(gettheCell);
		String str = c.getStringCellValue();
		if (str.equals(exsitingData)) {
			c.setCellValue(writeNewdata);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void excelRead(String sheetname, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet newsheet = wb.getSheet("Data");
		Row r = newsheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType == 1) {
			String stringCellValue = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MMMM/yyyy");
			String format = s.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(l);
		}
	}
}

