import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_tests_1 {
public static void main(String[] args) throws WebDriverException {}
public WebDriver driver;

@Test(priority = 0, description = "Positive test")
    public void verifyLoginPositive() throws InterruptedException {
      System.out.println("Test 1 is executing");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.phptravels.net/login");
      driver.manage().window().maximize();
      Thread.sleep(10000);
      driver.findElement(By.cssSelector("button[id='cookie_stop']")).click();
      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("user@phptravels.com");
      driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("demouser");
      driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
      Thread.sleep(10000);
      boolean dashboard = driver.findElement(By.xpath("//*[contains(text(),'Welcome Back')]")).isDisplayed();
      Assert.assertTrue(dashboard);
      driver.quit();
    }

@Test(priority =1, description = "Negative test")
    public void verifyLoginNegative() throws InterruptedException {
      System.out.println("Test 2 is executing");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.phptravels.net/login");
      driver.manage().window().maximize();
      Thread.sleep(10000);
      driver.findElement(By.cssSelector("button[id='cookie_stop']")).click();
      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("user@phptravels.com");
      driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("userdemo");
      driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
      Thread.sleep(15000);
      boolean LoginForm = driver.findElement(By.xpath("//*[contains(text(),'Please enter your account credentials below')]")).isDisplayed();
      Assert.assertTrue(LoginForm);
      driver.quit();
    }


  }


