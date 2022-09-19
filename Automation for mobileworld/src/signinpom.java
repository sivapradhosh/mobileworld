import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signinpom {
	@Test(dataProvider = "datas")
    public void signin(String username,String password) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sivapradhosh.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com//");
        landingpage landing = new landingpage(driver);
        landing.signinpom(username,password);
        }



@DataProvider



public Object[][] datas() {



   Object[][] data = new Object[2][2];
            
    data[0][0] = "siva";
    data[0][1] = "ss1421";
    
    data[1][0] = "sdfghjkasdfghjasdfghjasdfghjkasdfghjasdfghjkasdfghj";
    data[1][1] = "muje1421";
   
    
    return data;
    
    
}
    
}



