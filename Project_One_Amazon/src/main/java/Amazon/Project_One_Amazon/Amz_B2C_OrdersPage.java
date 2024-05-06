package Amazon.Project_One_Amazon;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_OrdersPage 
{
	WebDriver driver;
//step-1	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement click_past_order;//order placed last 3 months button

	@FindBy(xpath="//ul[@class='a-nostyle a-list-link']/li")
	List<WebElement> select_from_order;//select order month from dropdown
	
	@FindBy(id="Write-a-product-review_2")
	WebElement review_option;//write a product review option
	
	@FindBy(xpath="//img[@alt='select to rate item five star.']")
	WebElement rating;//rating option
	
	@FindBy(xpath="(//div[@class='a-alert-content']//span)[4]")
	WebElement alert_submitted;//submitted visible for assertion
//step-2
	public void select_past_order()
	{
		click_past_order.click();
	}
	public void choose_order_fromlist()
	{
		int count = select_from_order.size();
		System.out.println(count);
		select_from_order.get(count-8).click();
	}
	public void click_review_product()
	{
		review_option.click();
	}
	public void click_on_rating()
	{
		rating.click();
	}
//step-3
	public Amz_B2C_OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
