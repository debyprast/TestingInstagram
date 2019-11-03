package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInstagram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://www.instagram.com/") ;
		driver.manage().window().maximize();
		
		driver.findElement(By.id("_2hvTZ pexuQ zyHYP")).sendKeys("deby_pras");
		driver.findElement(By.id("_2hvTZ pexuQ zyHYP")).sendKeys("pengaturan911");
		driver.findElement(By.className("sqdOP  L3NKy   y3zKF")).click() ;
		String at = driver.getTitle() ;
		String et = "instagram" ;
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Login Berhasil") ;
		} else {
			System.out.println("Login Gagal") ;
		}

	}

}
