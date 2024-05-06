package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching 
{
	public static String username;
	public static String correct_pwd;
	public static String incorrect_pwd;
	public static String enter_name;
	public static String enter_phn_num;
	public static String enter_pwd;
	
	public void fetch_data() throws IOException 
	{
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\KING\\eclipse-workspace\\Project_One_Amazon\\Data sheet\\data.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		username = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();//for login 
		correct_pwd = wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();//for login
		incorrect_pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();//for login
		enter_name = wb.getSheet("register").getRow(0).getCell(0).getStringCellValue();//for registration
		enter_phn_num = NumberToTextConverter.toText(wb.getSheet("register").getRow(1).getCell(0).getNumericCellValue());//for registration
		enter_pwd = wb.getSheet("register").getRow(2).getCell(0).getStringCellValue();
		
	
	}

	
	
}
