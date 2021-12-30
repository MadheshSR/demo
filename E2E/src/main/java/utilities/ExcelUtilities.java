package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	public static ArrayList<String> getdata() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\maddy\\Documents\\test.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		 ArrayList<String>a= new ArrayList<String>();
		 XSSFSheet sheet= workbook.getSheet("Sheet1");
		 Iterator<Row> row= sheet.iterator();
		 Row r1=row.next();
		 Iterator<Cell> c=r1.cellIterator();
		 while(c.hasNext())
		 {
			 Cell value=c.next();
			 a.add(value.getStringCellValue());
		 }
		 return a;
	}

}

