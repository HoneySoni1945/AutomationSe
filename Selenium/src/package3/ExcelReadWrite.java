package package3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wb = new XSSFWorkbook("sample.xlsx");
/*XSSFSheet sh =wb.createSheet("test");
XSSFRow row =sh.createRow(0);
XSSFCell cell =row.createCell(0);
cell.setCellValue("1234");
wb.write(new FileOutputStream("sample.xlsx"));
wb.close();*/
XSSFSheet sh =wb.getSheet("test");

XSSFRow row =sh.getRow(0);
XSSFCell cell =row.getCell(0);

try
	{
		System.out.println(cell.getStringCellValue());
	}
	catch(IllegalStateException e)
	{
		if(e.getMessage().contains("NUMERIC"))
		{
			System.out.println(cell.getNumericCellValue());
		}
		else if(e.getMessage().contains("BOOLEAN"))
		{
			System.out.println(cell.getBooleanCellValue());
		}
	}
	
wb.close();
	}

}
