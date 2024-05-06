package Amazon.Project_One_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_B2C_Search1 //search for shoe
{
	WebDriver driver;
//step-1
	@FindBy(id="twotabsearchtextbox")
	WebElement search_bar;//search textfield
	
	@FindBy(linkText="Women's Running Shoes")
	WebElement select_category; //sorting women running shoe
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")//sorting brand
	WebElement select_brand;
	
	@FindBy(linkText="₹500 - ₹1,000")//sorting price
	WebElement select_price;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement click_on_shoe;// click on first shoe
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")//sorting with rating
	WebElement select_rating;
	
	@FindBy(xpath="(//span[@class='a-button a-button-normal a-button-toggle a-button-small aok-float-left buttonsprite'])[4]")//sorting shoe size
	WebElement select_shoe_size;//sorting with shoe size
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[9]")
	WebElement sort_by_option;//sort by feature visible once searching is done
	
	@FindBy (xpath="//span[.='Results']")
	WebElement searched_result; // results option visible after sorting is done. (done for assertion)
//step-2
	public void search_here()
	{
		search_bar.sendKeys("shoe");
		search_bar.sendKeys(Keys.ENTER);
	}
	public void sort_category()
	{
		select_category.click();
	}
	public void sort_brand_shoe()
	{
		select_brand.click();
	}
	public void sort_price()
	{
		select_price.click();
	}
	
	public void select_shoe()
	{
		click_on_shoe.click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> pcid = id.iterator();
		String p_id = pcid.next();
		String c_id = pcid.next();
		driver.switchTo().window(c_id);
	}
	
	public void sort_rating()
	{
		select_rating.click();
	}
	public void sort_shoe_size()
	{
		select_shoe_size.click();
	}
//step-3
	public Amz_B2C_Search1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
