package airline_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching {
	
	public static String enter_phn_num;
	public static String enter_name;
	public static String enter_email;
	public static String incorrect_num;
	public  static String pincode;
	public  static String firstname;
	public  static String lastname;
	public  static String email_id;
	public  static String phn_number;

	
	public void fetch_data() throws IOException 
	{
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\KING\\eclipse-workspace\\Project_Two_Airline\\Excel Data\\data.xlsx");
		Workbook wb = WorkbookFactory.create(f1);

		enter_phn_num = NumberToTextConverter.toText(wb.getSheet("register").getRow(0).getCell(1).getNumericCellValue());// for registration
		enter_name = wb.getSheet("register").getRow(1).getCell(1).getStringCellValue();// for registration
        enter_email = wb.getSheet("register").getRow(2).getCell(1).getStringCellValue();//for registration
		incorrect_num = NumberToTextConverter.toText(wb.getSheet("register").getRow(3).getCell(1).getNumericCellValue());//for login
		pincode = NumberToTextConverter.toText(wb.getSheet("details").getRow(1).getCell(1).getNumericCellValue());
		firstname = wb.getSheet("details").getRow(2).getCell(1).getStringCellValue();
		lastname = wb.getSheet("details").getRow(3).getCell(1).getStringCellValue();
		email_id = wb.getSheet("details").getRow(4).getCell(1).getStringCellValue();
		phn_number = NumberToTextConverter.toText(wb.getSheet("details").getRow(5).getCell(1).getNumericCellValue());
				
	}
}