package data_Driven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException
	{

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		//src\test\resources\TestData - right click and properties - copy from \src\test
		
		//Inside dependencies added, we have a class called workbook factory - method -create()
		Workbook wb = WorkbookFactory.create(fis); 
		//this statement contains the excel file and it is stored inside the reference variable wb
		
		//in excel - row and column starts with index 0
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//just printing the values
		System.out.println(username);
		System.out.println(password);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
	}	

}
