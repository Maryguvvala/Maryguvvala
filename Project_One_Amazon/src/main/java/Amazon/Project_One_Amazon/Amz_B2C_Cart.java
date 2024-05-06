package Amazon.Project_One_Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amz_B2C_Cart 
{
	WebDriver driver;
//step-1	
	@FindBy(id="a-autoid-0-announce")
	WebElement select_first_item;//first item selected to update

	@FindBy (xpath="//ul[@class='a-nostyle a-list-link']/li")
	List<WebElement> select_from_list;//selecting count to be updated
	
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[2]")
	WebElement click_delete; //to delete an item from the cart
	
	@FindBy(id="sc-buy-box-ptc-button")
	WebElement click_proceed; // click on proceed to buy
	
	//step-2
	
	public void click_item()
	{
		select_first_item.click();
	}
	public void select_num_update()
	{
		int count = select_from_list.size();// using auto suggestion code to select num bcz select tag is not there for dropdown
		System.out.println(count);
		select_from_list.get(count-4).click();;
	
	}
	public void delete_item()
	{
		click_delete.click();
	}
	public void proceed_to_buy()
	{
		click_proceed.click();
	}
	
//step-3
	public Amz_B2C_Cart(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
}
