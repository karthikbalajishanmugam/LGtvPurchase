package org.amezon.resources;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Commenactions {
	public static WebDriver driver;
	
	public void Browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balas\\eclipse-workspace\\LgTv.Purchase\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
	
	public void WindowHandle() throws InterruptedException {
	
	
	String ParentWin = driver.getWindowHandle();
	Set<String> allWin = driver.getWindowHandles();
	for(String x : allWin ) {
		if (!x .equals(ParentWin)) {
			driver.switchTo().window(x);
			Thread.sleep(3000);
		}
	}
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\balas\\eclipse-workspace\\LgTv.Purchase\\screenshot\\LGTv.png");
		FileUtils.copyFile(source,trg);
	}
}