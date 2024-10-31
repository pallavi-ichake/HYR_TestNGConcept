package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Part3_ApachiPoiReadData 
{
	public static void main(String[] args) throws IOException
	{
		
	File excelFile = new File("C:\\Users\\danga\\OneDrive\\FBTestData.xlsx");	
	FileInputStream fis = new FileInputStream(excelFile);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("sheet2");
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	int colCount = sheet.getRow(0).getLastCellNum();
	
	String[][] data = new String[rowCount-1][colCount];
	for(int i=0;i<rowCount;i++)
	{
		for(int j=0;j<=colCount;j++)
		{
			DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
	}
	
	wb.close();
	fis.close();
	

	
	
}

}



