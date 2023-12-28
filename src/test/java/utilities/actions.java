package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class actions extends Baseclass {

	public void elementClick(WebElement element) {
		element.click();
	}

	public void elementSendKeys(WebElement element,String text) {
		element.sendKeys(text);
	}

	public void longClick(WebElement element, long time) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", time));
	}

	public void doubleClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	}

	public void javascriptClick(WebElement element) {
		driver.executeScript("mobile: clickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	}

	public void scroll(String direction) {
		boolean canScrollMore;

		switch (direction) {
		case "up":
			do {
				canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
						ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "up",
								"percent", 3.0));

			} while (canScrollMore);
			break;
		case "down":
			do {
				canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
						ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down",
								"percent", 3.0));

			} while (canScrollMore);
			break;
		case "right":
			do {
				canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
						ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "right",
								"percent", 3.0));

			} while (canScrollMore);
			break;
		case "left":
			do {
				canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
						ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "right",
								"percent", 3.0));

			} while (canScrollMore);
			break;
		}

	}

	public void swipe(String direction) {

		switch (direction) {
		case "up":
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
					"width", 200, "height", 200, "direction", "up", "percent", 0.75));
			break;
		case "down":
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
					"width", 200, "height", 200, "direction", "down", "percent", 0.75));
			break;
		case "left":
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
					"width", 200, "height", 200, "direction", "left", "percent", 0.75));
			break;
		case "right":
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
					"width", 200, "height", 200, "direction", "right", "percent", 0.75));
			break;

		}

	}
	
	
	public void scrolltoText(String textname) {
	    String scrollableList = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + textname + "\"))";
	    driver.findElement(AppiumBy.androidUIAutomator(scrollableList));
	}

	public void Wait(long value) throws Exception {
	    try {
	        Thread.sleep(value);
	    } catch (Exception e) {
	        
	    }
	    
	}
	
}
