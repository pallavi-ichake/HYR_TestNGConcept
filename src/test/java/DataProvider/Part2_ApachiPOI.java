package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Part2_ApachiPOI
{
	public static void main(String[] args) throws IOException 
	{	
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("sheet2");
	sheet.createRow(0);
	sheet.createRow(1);
	sheet.createRow(2);
	
	sheet.getRow(0).createCell(0).setCellValue("Abhi");
	sheet.getRow(0).createCell(1).setCellValue("Pal");
	
	sheet.getRow(1).createCell(0).setCellValue("Pallavi");
	sheet.getRow(1).createCell(1).setCellValue("Ichake");

	sheet.getRow(2).createCell(0).setCellValue("Rajsmita");
	sheet.getRow(2).createCell(1).setCellValue("Deshmukh");
	
	File excelFile = new File("C:\\Users\\danga\\OneDrive\\FBTestData.xlsx");	
	FileOutputStream fos = new FileOutputStream(excelFile);
	wb.write(fos);
	fos.close();
	}
}


