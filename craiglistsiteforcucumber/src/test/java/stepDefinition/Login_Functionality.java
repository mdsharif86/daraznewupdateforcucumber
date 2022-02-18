package stepDefinition;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import base.Base;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Login_Functionality extends Base {
		@Given("I am in craiglist.org")
		public void i_am_in_craiglist_org() {
		    driver.get("https://oklahomacity.craigslist.org/");
		    
		}

		@Given("I want to search the craiglist site")
		public void i_want_to_search_the_craiglist_site() {
			Boolean isSearchExists = driver.findElement(By.xpath("//input[@id='query']")).isDisplayed();
			Boolean expected = true;
			assertEquals(isSearchExists, expected); 
		}
		@Then("i need to click on farm and garden")
		public void i_need_to_click_on_farm_and_garden() {
		    driver.findElement(By.xpath("//*[@id='sss1']/li[1]/a/span")).click();
		}

		@Then("i need to click on my search button")
		public void i_need_to_click_on_my_search_button() {
		    driver.findElement(By.xpath("//input[@name='query']")).sendKeys("cow");
		}
		
		@Then("I need to put the word cow as a search word")
		public void i_need_to_put_the_word_cow_as_a_search_word() {
		  driver.findElement(By.xpath("//span[@class='icon icon-search']")).click(); 
		}
//		@Then("I want to put cow as my search result")
//		public void i_want_to_put_cow_as_my_search_result() {
//		   
//		}
//
//		@Then("I need to put the word cow as a search word")
//		public void i_need_to_put_the_word_cow_as_a_search_word() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

//		@Then("I need to select how many has a picture of a cow")
//		public void i_need_to_select_how_many_has_a_picture_of_a_cow() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

		@Then("i can see how many they have in fifty miles")
		public void i_can_see_how_many_they_have_in_fifty_miles() {
		    driver.findElement(By.xpath("//*[@id='searchform']/div[2]/div[2]/div[4]/input[1]")).sendKeys("50");
		}

		@Then("i can see how many in my zipcode")
		public void i_can_see_how_many_in_my_zipcode() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}
