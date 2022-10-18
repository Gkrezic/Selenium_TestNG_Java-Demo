import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_tests_2 {
public static void main(String[] args) throws WebDriverException {}
public WebDriver driver;

@Test(priority = 0, description = "Kupovina")
    public void verifyBuyingItems() throws InterruptedException {
      System.out.println("Test 1 is executing");
      WebDriver driver = new ChromeDriver();
      driver.get("http://automationpractice.com/index.php");
      driver.manage().window().maximize();
      Thread.sleep(1000);
      driver.findElement(By.id("search_query_top")).sendKeys("summer dresses");
      driver.findElement(By.cssSelector("button[name='submit_search']")).click();
      driver.findElement(By.linkText("Printed Summer Dress")).click();
      driver.findElement(By.id("group_1")).sendKeys("M");
      driver.findElement(By.xpath("//*[contains(text(),'Add to cart')]")).click();
      Thread.sleep(10000);
      driver.findElement(By.cssSelector("span[title='Continue shopping']")).click();
      Thread.sleep(1000);
      driver.findElement(By.linkText("Summer Dresses")).click();
      driver.findElement(By.linkText("Printed Chiffon Dress")).click();
      driver.findElement(By.id("group_1")).sendKeys("M");
      driver.findElement(By.xpath("//*[contains(text(),'Add to cart')]")).click();
      Thread.sleep(10000);
      driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']")).click();
      driver.findElement(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']")).click();
      driver.findElement(By.id("email")).sendKeys("testing2@net.hr");
      driver.findElement(By.id("passwd")).sendKeys("demouser");
      driver.findElement(By.id("SubmitLogin")).click();
      driver.findElement(By.cssSelector("button[name='processAddress']")).click();
      driver.findElement(By.id("cgv")).click();
      driver.findElement(By.cssSelector("button[name='processCarrier']")).click();
      driver.findElement(By.cssSelector("a[title='Pay by bank wire']")).click();
      driver.findElement(By.xpath("//*[contains(text(),'I confirm my order')]")).click();
      Thread.sleep(10000);
      boolean OrderConfirmation = driver.findElement(By.id("order-confirmation")).isDisplayed();
      Assert.assertTrue(OrderConfirmation);
      driver.quit();
    }


  }




