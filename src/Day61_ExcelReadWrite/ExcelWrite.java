package Day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * Apache POI Library: used for Data Driven Testing. there special classes & interfaces that we can use to retrive data from excel file
How to add external jars & libraries to java project:
        right click the project -> properties -> Java Build Path -> Library ->  click classPath(if you have) -> click "Add External Jars&Libraries" -> add all the jar files that you needed
        Apply -> apply&close
        in a maven project we don't need to download and add libraries manually, it's all done by writeing the dependecies
        
            <dependency>
                <groupId>org.apache.poi</groupId>
                <artifactId>poi</artifactId>
                <version>4.0.0</version>
            </dependency>
            
FileInputStream: helps us to read file
WorkBook(I) : designed for excelfile, reads excel files
                implemented by XSSFWorkBook class
Sheet(I): helps to get spreadsheets from excel file
               implemented by XSSFSheet class
Cell(I): helps us to retrive specific cell

 * 
 * <>
 */
public class ExcelWrite {
public static void main(String[] args) throws Exception {
	
	String path ="/Users/dmitriykalinin/Desktop/Workbook1.xlsx"; //path for excel 
	String sheetname = "Sheet1";// name of the sheet
	FileInputStream file = new FileInputStream(path);//reads a file
	Workbook excelFile = WorkbookFactory.create(file);//Workbook specially designed for Excel Files
	Sheet sheet = excelFile.getSheet("Sheet1"); //gets the specific spread sheet from excel file
	Cell cell = sheet.getRow(0).getCell(0);//retrieves specific cell from spreadsheet
	cell.setCellValue("Nurzat");// it reads that cell value as . But it DOESNT change original value
	String cellData = cell.toString();// converts the cells to rhe string
	System.out.println(cellData);
	
}
}
