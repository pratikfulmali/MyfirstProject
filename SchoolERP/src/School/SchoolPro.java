package School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SchoolPro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUJ\\Desktop\\chromedriver.exe\\");
		WebDriver i =new ChromeDriver();
		i.get("http://43.205.184.226/Admin/public/login");
		i.manage().window().maximize();
		String s=i.getCurrentUrl();
		String t= i.getTitle();
		System.out.println(""+s+""+t+"");
		//System.out.println("Page source"+i.getPageSource());
		System.out.println("GET Title , Current URL, Page Source");
	// For Admin		
		i.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[2]/input")).sendKeys("super_admin");
		Thread.sleep(2000);
		i.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[3]/input")).sendKeys("sk123");
		Thread.sleep(2000);
		i.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[5]/button")).click();
		
		System.out.println("login Successfull");
		Thread.sleep(2000);
		String u=i.getCurrentUrl();
		String v= i.getTitle();
		System.out.println(""+u+"   "+v+"");
		Thread.sleep(2000);
/*		i.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[4]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input")).sendKeys("pratik");
		Thread.sleep(2000);
		System.out.println("Cheak User Details Are Shown");
		i.navigate().to("http://43.205.184.226/Admin/public/dashboard");
		System.out.println("Back to the Dashboard page");
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id='navbar-mobile']/ul[2]/li/a/span")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id=\'navbar-mobile\']/ul[2]/li/div/a[3]")).click();
		Thread.sleep(2000);
		System.out.println("Back too login page");
*/
		
	// Cheak The Admin Can create new user profile 
		
		i.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id=\'ajax-reg-p-0\']/div[1]/div[1]/div/input")).sendKeys("P-Arnav N. Goswami");
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id=\'ajax-reg-p-0\']/div[1]/div[2]/div/input")).sendKeys("Government College Rd, Near Government College, New Prem Nagar, Civil Lines, Ludhiana ");
		Thread.sleep(2000);
		
		i.findElement(By.xpath("//*[@id=\'ajax-reg-p-0\']/div[2]/div[1]/div[1]/input[1]")).sendKeys("Abc@gmail.com");
		Thread.sleep(2000);
		i.findElement(By.xpath("//*[@id=\'ajax-reg-p-0\']/div[2]/div[3]/div[1]/input[1]")).sendKeys("0123456789");
		
		WebElement drpNationality=i.findElement(By.id("nal_id"));
		Select drpNationality1=new Select(drpNationality);
		Thread.sleep(2000);
		drpNationality1.selectByVisibleText("Indian");
		Thread.sleep(2000);
		
		
		
		WebElement drGender=i.findElement(By.id("gender"));
		Select drGender11=new Select(drGender);
		Thread.sleep(2000);
		drGender11.selectByVisibleText("Male");
		
		WebElement drState=i.findElement(By.id("state_id"));
		Select drState1=new Select(drState);
		Thread.sleep(2000);
		drState1.selectByVisibleText("PUNJAB");
		Thread.sleep(2000);
		WebElement drCity=i.findElement(By.id("lga_id"));
		Select drCity1=new Select(drCity);
		Thread.sleep(2000);
		drCity1.selectByVisibleText("Hoshiarpur");

		i.findElement(By.xpath("//*[@id=\"ajax-reg\"]/div[3]/ul/li[2]/a")).click();
		System.out.println("Next PAge");
		
		WebElement drClass=i.findElement(By.id("my_class_id"));
		Select drClass1=new Select(drClass);
		Thread.sleep(2000);
		drClass1.selectByVisibleText("bsc agri 1st year");
		
		WebElement drSection=i.findElement(By.id("section_id"));
		Select drSection1=new Select(drSection);
		Thread.sleep(2000);
		drSection1.selectByVisibleText("Plants Breeding.");
		
		System.out.println("last remaining");
		
		WebElement drYear=i.findElement(By.xpath("//*[@id=\'ajax-reg-p-1\']/div[1]/div[4]/div/label"));
		System.out.println("year select");

//		Select drYear1=new Select(drYear);
//		Thread.sleep(2000);
//		drYear1.selectByVisibleText("2018");
	
		System.out.println("Select done"); 
		
		
	}

}
