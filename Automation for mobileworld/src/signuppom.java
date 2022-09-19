import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signuppom {
@Test(dataProvider = "datas")



    public void signup1(String firstname,String lastname,String email,String passwords,String DOB,String phonenumber,String bio) throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sivapradhosh.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com//");
        landingpage landing = new landingpage(driver);
        landing.register(firstname, lastname, email, passwords, DOB, phonenumber, bio);



   }
@DataProvider



public Object[][] datas() {



   Object[][] data = new Object[2][7];
    
    data[0][0] = "siva";
    data[0][1] = "pradhosh";
    data[0][2] = "siva@gmail.com";
    data[0][3] = "siva123";
    data[0][4] = "06/10/1999";
    data[0][5] = "1234567890";
    data[0][6] = "hi guys this is a moblieworld page!";
    
    data[1][0] = "me";
    data[1][1]= "me";
    data[1][2]= "siva@gmail.com";
    data[1][3]="siva123456789pradhosh";
    data[1][4]="06/10/1999";
    data[1][5]="12345678901234567890";
    data[1][6]="hi guys this is a moblieworld page";
    
    return data;



}
}