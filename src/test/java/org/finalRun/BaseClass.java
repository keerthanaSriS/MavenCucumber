package org.finalRun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	static Actions a;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();

		return currentUrl;

	}

	public static String getTitle() {
		String title = driver.getTitle();

		return title;
	}

	public static void fillText(WebElement txtEmail, String value) {
		// txtEmail.sendKeys("greens");
		txtEmail.sendKeys(value);
	}

	public static void btnClick(WebElement element) {

		element.click();

	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void clickDouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void dragandDrop(WebElement start, WebElement end) {
		a = new Actions(driver);
		a.dragAndDrop(start, end).perform();

	}

	public static void copy() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static String readFromExcel(String sheetName1, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\dhivi\\eclipse-workspace\\MavenProject7pm\\ExternalStorage\\frames.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);

		Sheet sh = book.getSheet(sheetName1);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();

		String name = "";

		if (type == 1) {
			// String
			name = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-YYYY");
			// String
			name = s.format(da);

		} else {

			double d = c.getNumericCellValue();
			long lo = (long) d;
			// string
			name = String.valueOf(lo);

		}

		return name;

	}

	public static void takeSnap(String picName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scs = ts.getScreenshotAs(OutputType.FILE);
		File fe = new File("C:\\Users\\dhivi\\eclipse-workspace\\MavenProject7pm\\ScreenShot\\" + picName + ".png");
		FileUtils.copyFile(scs, fe);

	}

	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);

	}

	public static void applyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
}













