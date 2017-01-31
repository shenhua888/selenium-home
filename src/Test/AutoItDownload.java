package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

 

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
 

 

public class AutoItDownload  {
    


    public static void main (String [] args) throws InterruptedException, AWTException
    {
         
     
        String URL="https://www.autoitscript.com";
        //avoid Chrome warnning message like "unsupported command-line flag --ignore-certificate-errors. "
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
       
        System.setProperty("webdriver.chrome.driver", "C:\\SoftwareDevelopmentTest\\WorkPlaceMAVEN\\testMavenWeb\\webDriver\\chromedriver.exe ");  
        WebDriver driver = new ChromeDriver(options);
         //WebDriver driver = new FirefoxDriver();
       
        driver.get(URL);
     

        driver.manage().window().maximize(); 
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement editor=driver.findElement(By.xpath("//*[@id='menu-item-207']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(editor).perform();
        //locate download link
        WebElement d=driver.findElement(By.xpath("//*[@id='menu-item-209']/a"));
        d.click();
       
        Thread.sleep(5000);
        //right click the download link
      
       
        //locate download link
    
       
        //right click the download link
        WebElement download=driver.findElement(By.xpath("//*[@class='aligncenter']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        // roll down and keep the element to the center of browser
        js.executeScript("arguments[0].scrollIntoView(true);", download);
        actions.moveToElement(download).contextClick().build().perform();
//        actions.sendKeys(Keys.DOWN);
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.DOWN);
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.DOWN);
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.DOWN);
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.ENTER);
        Robot robot = new Robot();
        
     // This will bring the selection down one by one
      
     robot.keyPress(KeyEvent.VK_DOWN);
      
     Thread.sleep(1000);
      
     robot.keyPress(KeyEvent.VK_DOWN);
      
     Thread.sleep(1000);
      
     robot.keyPress(KeyEvent.VK_DOWN);
      
     Thread.sleep(1000);
      
     robot.keyPress(KeyEvent.VK_DOWN);
      
     Thread.sleep(1000);
      
    // robot.keyPress(KeyEvent.VK_DOWN);
      
     //Thread.sleep(1000);
      
     // This is to release the down key, before this enter will not work
      
     robot.keyRelease(KeyEvent.VK_DOWN);
      
     Thread.sleep(1000);
      
     robot.keyPress(KeyEvent.VK_ENTER);
       
        
        // this code block will snapshot the browser
//        File scrShot=new File("d:\\1.png");
//        File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            
//            FileUtils.copyFile(scrFile, scrShot);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            System.out.println("Can't save screenshot");
//            e.printStackTrace();
//        } 
//        finally
//        {
//           
//            System.out.println("screen shot finished");
//        }
       // System.out.println(scrFile.getAbsolutePath());
        
        //call autoIt to save the file
        try {
            Process process = Runtime.getRuntime().exec("C:\\Users\\shenhua\\Desktop\\AU3\\example\\download.exe E:\\download\\xx.exe");
            StringBuffer cmdout = new StringBuffer(); 
            InputStream fis = process.getInputStream(); 
            BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
			String line = null;
			while ((line = br.readLine()) != null) {
				cmdout.append(line);
			}
			String s = cmdout.toString().trim();
            System.out.println(s);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Thread.sleep(150000);
        driver.quit();
  
      
    }
    
}