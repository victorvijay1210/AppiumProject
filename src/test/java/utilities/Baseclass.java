package utilities;
import java.io.File;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Baseclass {

	public AppiumDriverLocalService service;
	public UiAutomator2Options option;
	public AndroidDriver driver;

	@BeforeClass
	public void setupAndroidDriver() throws Exception {

		// Appium start server

		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//hp//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		option = new UiAutomator2Options();
		option.setDeviceName("Vijayphone");
		option.setApp(
				"C://Users//hp//eclipse-workspace//AppiumProject//src//test//java//resources//ApiDemos-debug.apk");
		// launch android driver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);

		

	}

	@AfterClass
	public void tearDown() {
		// stop server
		driver.quit();
		service.stop();
	}
}
