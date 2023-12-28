package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLibrary {
	public String readFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commendata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	public String readFromExcelFile(String Sheet, int row, int cell) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/tesdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
}

}
