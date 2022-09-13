package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMoreAdvance {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file ;    // declaration only once  ==> local
		
		file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\selenium excel.xlsx");
		int rowno =WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
		System.out.println("Total Number of rows:- "+rowno);
		file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\selenium excel.xlsx");
		int cols= WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
		System.out.println("Total Number of cols:- "+ cols);
		
		for(int i= 0; i<=rowno; i++) {
			for(int j=0; j<cols;j++) {
				file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\selenium excel.xlsx");
				String data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	

}
