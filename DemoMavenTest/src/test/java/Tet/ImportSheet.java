package Tet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportSheet {

	public static void main(String[] args) throws IOException {
		try{
		File f = new File(System.getProperty("user.dir")+ "\\testData\\testCase01.xlsx");
		FileInputStream filePath = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet s = wb.getSheet("sheetTest");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		wb.close();
		}
		catch(Throwable t){
			t.printStackTrace();
			
		}
	}

}
