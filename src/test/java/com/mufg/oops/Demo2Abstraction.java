package com.mufg.oops;

//set of rules
interface WebDriverDemo {
	// only declaration
	// all method in interface are public abstract
	void get(String url);
	String getTitle();
	void quit();
}

interface JavascriptExecutorDemo
{
	void executeScript();
}

interface TakeScreenshotDemo
{
	void getScreenshot();
}
class ChromeDriverDemo implements WebDriverDemo,JavascriptExecutorDemo,TakeScreenshotDemo {
	public ChromeDriverDemo() {
		System.out.println("launch chrome browser");
	}

	public void get(String url) {
		System.out.println("chrome - navigate to url");
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return "Google";
	}

	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("close chrome");
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
}

class EdgeDriverDemo implements WebDriverDemo,JavascriptExecutorDemo, TakeScreenshotDemo {
	public EdgeDriverDemo() {
		System.out.println("launch edge browser");
	}

	public void get(String url) {
		System.out.println("edge navigation to url");

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return "google";
	}

	public void quit() {
		System.out.println("quit edge");
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
}

public class Demo2Abstraction  {

	public static void main(String[] args) {

//		String browser = "ch";
//		WebDriverDemo driver = null;
//
//		if (browser.equalsIgnoreCase("edge")) {
//			// Runtime polymorphism - method to be called is resolved during runtime
//			driver = new EdgeDriverDemo();
//		} else {
//			// Runtime polymorphism - method to be called is resolved during runtime
//			driver = new ChromeDriverDemo();
//		}

		WebDriverDemo driver =new ChromeDriverDemo();
		driver.get("http://google.com");
		driver.quit();
		
		JavascriptExecutorDemo js= (JavascriptExecutorDemo) driver;
		js.executeScript();
		
		TakeScreenshotDemo ts=(TakeScreenshotDemo) driver;
		ts.getScreenshot();
	}

}
