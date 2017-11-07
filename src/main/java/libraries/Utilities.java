package libraries;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {

	/*public String date() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat();
		String formatedDate=sdf.format(date);
		return formatedDate;
	}*/
	public static void captureScreenshot(WebDriver driver, String screenshotName) throws Exception{
		try {
			TakesScreenshot scr=(TakesScreenshot)driver;
			File source=scr.getScreenshotAs(OutputType.FILE);
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("MM_dd_YY-hh-mm-a");
			String formatedDate=sdf.format(date);
			
			FileUtils.copyFile(source,new File( "./Reports/"+screenshotName+"_"+formatedDate+".png"));
		}catch (Exception e) {
			System.out.println("Exception occured while taking screenshots "+e.getMessage());
		}
	}
	
	
}
