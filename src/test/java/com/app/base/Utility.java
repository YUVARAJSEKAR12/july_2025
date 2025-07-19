package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver = null;
	
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}
	
	public static void click_value(WebElement element) {
		element.click();
	}
	
	public static void selectbyText(WebElement element , String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}
	
	public static void selectbyValue(WebElement element , String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	@AfterClass
	public static void screenshot() {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src=  ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\A_July_2025\\ScreenShots\\test.jpeg");
			FileUtils.copyFile(src, dest);
			driver.quit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Set<String> windowHandles = driver.getWindowHandles(); // forloop ->
	 * 
	 * ChromeDriver ch = new ChromeDriver();
	 * 
	 * driver.manage().window().maximize(); WebElement element =
	 * driver.findElement(By.id(""));
	 * 
	 * try { Robot r = new Robot(); r.keyPress(KeyEvent.KEY_FIRST); Actions a = new
	 * Actions(driver); a.keyDown(Keys.ADD);
	 * 
	 * } catch (AWTException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * browserLaunch(); }
	 */

	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static String excelreuse(int i, int j) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\A_July_2025"
					+ "\\src\\test\\resources\\TestData\\July_2025.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			//
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					// System.out.println(dateCellValue);
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public  static String read_prop_reuse(String data) {

		String value = null;
		try {
			FileReader read = new FileReader(
					new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\A_July_2025\\src\\test"
							+ "\\resources\\TestData\\config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
}
