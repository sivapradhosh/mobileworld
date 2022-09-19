import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage 
{
	
	    
	    WebDriver driver;
	    public landingpage(WebDriver driver)
	    {
	    this.driver =driver;
	    PageFactory.initElements(driver, this);
	    }
	    
	    
	    //SIGNIN
	    
	    
	        @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	        WebElement signin;
	    
	        @FindBy(id = "username")
	           WebElement  username;
	        
	        @FindBy(id= "password")
	        WebElement password;
	        
	        @FindBy(xpath="//*[@id=\"submitForm\"]/div[4]/a")
	        WebElement login;
	        
	        
	        //SIGNUP
	        
	        
	        
	        @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	        WebElement Signin;
	        
	        @FindBy(linkText = "Sign up")
	           WebElement  Signup;
	        
	        @FindBy(css = "input[type='text']")
	           WebElement  firstname;
	        
	        @FindBy(xpath= "//input[@placeholder='Last Name']")
	           WebElement  lastname;
	        
	        @FindBy(xpath = "//input[@placeholder='Enter Email']")
	           WebElement  email;
	        
	        @FindBy(xpath = "//input[@type='Password']")
	           WebElement  passwords;
	        
	        @FindBy(xpath = "//input[@type='date']")
	           WebElement DOB;
	        
	        @FindBy(xpath="//input[@type='radio']")
	        WebElement  gender;
	        
	        @FindBy(xpath = "//input[@min='0']")
	           WebElement  phonenumber;
	        
	        @FindBy(xpath = "//textarea[@rows='3']")
	           WebElement  bio;
	        
	        @FindBy(xpath = "//button[@type='submit']")
	           WebElement  registers;
	    
	        
	        
	    public void signinpom(String name, String pass) throws InterruptedException 
	    {
	    	signin.click();
	        username.sendKeys(name);
	        Thread.sleep(2000);
	        password.sendKeys(pass);
	        Thread.sleep(2000);
	        login.click();
	     
	    }
	    public void register(String fname,String lname,String emailaddress,String pwd,String dob,String phone,String bioshort) throws InterruptedException 
	    {
	        Signin.click();
	        Signup.click();
	        firstname.sendKeys(fname);
	        lastname.sendKeys(lname);
	        email.sendKeys(emailaddress);
	        passwords.sendKeys(pwd);
	        DOB.sendKeys(dob);
	        gender.click();
	        phonenumber.sendKeys(phone);
	        bio.sendKeys(bioshort);
	        registers.click(); 
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	        
	    }
	   

	   }

