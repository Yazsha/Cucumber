package org.testngdemo;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilityclass {

		public static WebDriver driver;
		public static File file;
		public static FileInputStream fin;
		public static FileOutputStream fout;
		public static Workbook workbook;
		public static Sheet sheet;
		public static Row row;
		public static Cell cell;
		public static Robot r;
		public static Actions a;
		public static Alert alt;
		public static TakesScreenshot ts;
		public static JavascriptExecutor js;
		public static WebElement datepickout;
		
		
	public static Select s;
	
	public static void singleselectval(WebElement element, String ele) {
		s=new Select(element);
		s.selectByValue(ele);
	}
	
	public static void singleselectindx(WebElement element, int ele) {
		s=new Select(element);
		s.selectByIndex(ele);
		}
		
	public static void singleselectindx(WebElement element, String ele) {
		s=new Select(element);
		s.selectByVisibleText(ele);
		}	

			public static String gettAttribute(WebElement element,String value) {
					return element.getAttribute(value);
				}
			public static String gettText(WebElement element2) {
				return element2.getText();
			}


		
	
		
		//Robot
		
		public static void keypresselement(int txt)
		{
			r.mousePress(txt);
		}
		
		public static void keyReleaseelement(int txt)
		{
			r.mouseRelease(txt);
		}
		//Action---------------------->doubleclick
		public static void doubleclickElement(WebElement element) {
			a.doubleClick(element);

		}
			
		//Action----->contextClick(Rightclick)
		public static void contextClickElement(WebElement element)
		{
			a.contextClick(element);
		}
		//Action----->clickAction
		public static void elementClick(WebElement element)
			{
			a.click();
			}
		//Action------->move to Element
		public static void moveToElement(WebElement element)
		{
			a=new Actions(driver);
		}
		//Action----->drag and drop the element
		public static void dragandDropElement(WebElement source,WebElement destElement)
		{
			a.dragAndDrop(source, destElement);
		}
	//Alert---- accept( prompt alert)
		public static void acceptAlert()
		{
			alt= driver.switchTo().alert();//to switch into alert
			alt.accept();
		}
		//Alert-------------> to give "No" to dismiss an alert
		public static void dismissAlert()
		{
			alt.dismiss();
		}
		//Alert------to print the text from the alert
		public static String getTextAlert()
		{
			return alt.getText();
		}
		//Alert -------> to insert the values in the box
		public static void sendkeysAlert(String text)
		{
			alt.sendKeys(text);
			
		}
		//Navigation-------------move to the next page
		public static void forwardNavigation() {
			driver.navigate().forward();
		    }
		//Navigation-------------move to the previous page
		   public static void backwardNavigation() {
				driver.navigate().back();
		   }
		   
		 //Navigation-------------to refresh a page
		   public static void refreshNavigation() {
				driver.navigate().refresh();
		   }
		   
		 //Navigation-------------to navigate the given page
		   public static void navigationUrl(String txt)
		   {
			   driver.navigate().to("txt");
			   
		   }
		   //FRAMEWork----------->switch into the frame
		   public static void frame(String txt) {
			driver.switchTo().frame(txt);
		   }
		   //FRAMEWork----------->switch into the frame
		   public static void Frameid(String id) {
				driver.switchTo().frame(id);
			   }
		 //FRAMEWork----------->switch into the frame( method overloading)
		   public static void elementFrame(WebElement element) {
				driver.switchTo().frame(element);
			   }
		   //FRAMEWork----------->switch into the frame index
		   public static void indexFrame(int index) {
				driver.switchTo().frame(index);
			   }
		   //FRAMEWork----------->switch into the parentframe 
		   public static void parentFrame() {
			   driver.switchTo().parentFrame();	
		      }
		   //FRAMEWork----------->switch into the defaultContentFrame
		   public static void defaultContentFrame() {
			   driver.switchTo().defaultContent();	
		      }
		   //WINDOWS HANDLING
		   //WINDOWS HANDLING---------------> to get the window url
		   public static void urlWindowsHandling(String url) {
			   driver.switchTo().window(url);
		      }
		   //WINDOWS HANDLING -----------> to get the title of the window
		   
		   public static void titleWindowshandling(String title) {
			   driver.switchTo().window(title);
		      }
		   //WINDOWS HANDLING -----------> to get all the id
		   public static void idWindowshandling(String WindowsId) {
			   driver.switchTo().window(WindowsId);
		      }
		   //WINDOWS HANDLING -----------> to get the parent id
		   public static String parentntWindowhandle() {
			  String parentId = driver.getWindowHandle();
			  return parentId;
		      }	
		   
			public static void IdWindowhandling(String id)
			{
				driver.switchTo().window(id);
			}
			//TakesScreenshot---------------doubt
			public static void getscreenst() {
							
			ts= (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File des= new File("C:\\Users\\User\\eclipse-workspace\\SeleniumProject\\screen\\moto.png");
			
			try {
				FileUtils.copyFile(source, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			//Visibility check------to check the visibility of WebElements	
			public static boolean enablecheck(WebElement element ) {
				
			return	element.isEnabled();
			}
			
			public static boolean displaycheck(WebElement element) {
			return	element.isDisplayed();
			}
			
			public static boolean Selectcheck(WebElement element) {
				return	element.isSelected();
				}
			//Dropdown---------->single select
				public static void singleSelectVal(WebElement sing) {
				Select s1= new Select(sing);
				 List<WebElement> singleAll = s1.getOptions();
				 for (int i = 0; i <singleAll.size(); i++) {
				WebElement sAll = singleAll.get(i);
				 System.out.println(sAll.getText());
			}
		}
			//Dropdown---------->multiple select
			public static void getAllSelection(WebElement multiple) {
				Select s1= new Select(multiple);
				List<WebElement> allSelected = s1.getAllSelectedOptions();
				for (int i = 0; i < allSelected.size(); i++) {
					WebElement allS = allSelected.get(i);
					System.out.println(allS.getText());
			}
		}
			
			//Dropdown----------> select by Index
			public static void selectByIndex( WebElement element, int num) {
				Select s= new Select(element);
				s.selectByIndex(num);
			}
			//Dropdown----------> select by Value
			public static void selByVal(WebElement element,String val){
				Select s= new Select(element);
				s.selectByValue(val);
			}
			//Dropdown----------> select by text
			public static void selByTxt(WebElement element,String txt) {
				Select s=new Select(element);
				s.selectByVisibleText(txt);
				
			}
			//Dropdown---------------------->First Selected
			public static String firstSelectdropdwn(WebElement element) {
				Select s= new Select(element);
				WebElement fs = s.getFirstSelectedOption();
				String text = fs.getText();
				System.out.println(text);
				return text;
				
			}
			//JavascriptExecutor
			public static void scrollPageDownjs(WebElement element) {
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", element);
		}
			public static void insertValueJavaScrip(WebElement element,String text) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('value','"+text+"')", element);
			}
			public static Object getValueJavaScript(WebElement element) {
				 Object executeScript = js.executeScript("arguments[0].getAttribute('value')", element);
				 return executeScript;
			}
			public static void clickJavaScript(WebElement element) {
				js.executeScript("arguments[0].click()", element);
			}
		    public static void scrollDownJavaScript(WebElement element) {
				js.executeScript("arguments[0].scrollIntoView(true)", element);
			}
			public static void scrollUpJavaScript(WebElement element) {
				js.executeScript("arguments[0].scrollIntoView(false)", element);
			}
			public static void styleJavaScript(String attSty , WebElement element) {
				js.executeScript("arguments[0].setAttribute('style','attSty'",element);
			}

			
	

	      
		
		//*********************************************
		
		public static void loadBrowser() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		public static void loadEdge() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		public static void lanchUrl(String url) {
			driver.get(url);

		}
		
		public static void closeBrowser() {
		driver.close();
		}
		
		public static void enterText(WebElement element1, String value) {
	    element1.sendKeys(value);
		}
		
		public static void clickElement(WebElement element) {
			
		element.click();

		}
		
		public static void maximizeBrowser() {
		driver.manage().window().maximize();

		}

		public static void pauseExecution(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		public static String readDataFromExcel(String filename,String sheetName,int rowno,int cellno) {
			file= new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
			try {
			 fin= new FileInputStream(file);
			} catch (FileNotFoundException e) {
				
			}
			try {
				workbook = new XSSFWorkbook(fin);
			} catch (IOException e) {
				
			}
			Sheet sheet = workbook.getSheet("sheetName");
			Row row = sheet.getRow(rowno);
			
			Cell cell = row.getCell(cellno);
			
			int cellType = cell.getCellType();
			String value= null;	
			
			if (cellType==1) {
				//String
				value = cell.getStringCellValue();
			}else if (DateUtil.isCellDateFormatted(cell)) {
				
				Date d = cell.getDateCellValue();
				SimpleDateFormat s= new SimpleDateFormat("dd-MMMM-YYYY");
				 value = s.format(d);
				
			}else {
				//Number
				double dd = cell.getNumericCellValue();
				long l= (long) dd;
				value= String.valueOf(l);
			}
		return value;
	}
	
	public static void writeExcel(String filename,String sheetName, int newRow,int newCell,String data) throws IOException {
			// To create a file
	
		file= new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
		
		workbook= new XSSFWorkbook();
		Sheet s =workbook.createSheet(sheetName);
		//Row creation
		Row r = s.createRow(newRow);
		//cell creation
		Cell c = r.createCell(newCell);
		c.setCellValue(data);
		 fout = new FileOutputStream(file);
		workbook.write(fout);
		System.out.println("Done");
		
	}
	public static void createCellOnly(String filename,String sheetName,int newRow,int newcell,String value) throws IOException{
	
		 file= new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
	 fin= new FileInputStream(file);
		workbook=new XSSFWorkbook(fin);
		Sheet s= workbook.getSheet(sheetName);
		Row r = s.getRow(newRow);
		Cell c = r.createCell(newcell);
		c.setCellValue(value);
		 fout = new FileOutputStream(file);
		workbook.write(fout);
		System.out.println("Done");

	}
	
	public static void createRowOnly(String filename,String sheetName,int newRow, int newCell, String value) throws IOException{
		 file= new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
		 fin =new FileInputStream(file);
		 workbook= new XSSFWorkbook(fin);
		 Sheet s= workbook.getSheet(sheetName);
		 Row r = s.createRow(newRow);
		 Cell c = r.createCell(newCell);
		 c.setCellValue(value);
		 fout= new FileOutputStream(file);
		 workbook.write(fout);
		 System.out.println("Done");
	}
	public static void excelUpdate(String filename , String sheetName, int newRow,int newCell,String value, String updatedata) throws IOException {
		
		 file= new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
		 fin =new FileInputStream(file);
		 workbook= new XSSFWorkbook(fin);
		Sheet s = workbook.getSheet(sheetName);
		Row r = s.getRow(newRow);
		Cell c = r.getCell(newCell);
		String txt = c.getStringCellValue();
		if (txt.equals(txt)) {
			c.setCellValue(updatedata);
		}
		try {
			fout= new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");

	}
		public static void applywaittoAllElements() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
	
		public static String getcurrentPageTitle() {
		String title = driver.getTitle();
		return title;
		}
		
		public static String getCurrentPageUrl() {
		return driver.getCurrentUrl();
		}
		public static void createExcelRowANDCell(String filename,String sheetName ,int rowNo,int cellNo,String data)
				throws IOException {
			
			file = new File("C:\\Users\\User\\eclipse-workspace\\SampleMaven\\Excel-files\\"+filename+".xlsx");
			
			
			if (rowNo==0&&cellNo==0 ) {

			workbook=new XSSFWorkbook();
			 sheet = workbook.createSheet(sheetName);
			row = sheet.createRow(rowNo);
			cell=row.createCell(cellNo);
			
			}
			else if (rowNo>=0 && cellNo>0) {	
				
				fin= new FileInputStream(file);
				workbook= new XSSFWorkbook(fin);
				sheet=workbook.getSheet(sheetName);
				row=sheet.getRow(rowNo);
				cell=row.createCell(cellNo);
				
			}else if (rowNo>0 && cellNo==0) {
				
				fin= new FileInputStream(file);
				workbook=new XSSFWorkbook(fin);
				sheet=workbook.getSheet(sheetName);
				row=sheet.createRow(rowNo);
				cell=row.createCell(cellNo);
			}
			
			cell.setCellValue(data);
			fout=new FileOutputStream(file);
			workbook.write(fout);
			System.out.println("Success");
			
			}
		private void EnterDate(WebElement ele) {
			driver.findElement(By.xpath("//input[@name='datepick_out']"));
			datepickout.clear();
			datepickout.sendKeys("22/09/2023");

		}
		}


