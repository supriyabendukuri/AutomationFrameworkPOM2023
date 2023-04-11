package com.qa.opencart.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {

	private Properties prop;
	private ChromeOptions co;
	private FirefoxOptions fo;
	private EdgeOptions eo;
	
	public OptionsManager (Properties prop) {
		this.prop = prop;
	}
	
	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) {
			System.out.println("=======Running chrome in headless========");
			co.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) {
			System.out.println("=======Running chrome in incognito========");
			co.addArguments("--incognito");
		}
		return co;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		fo = new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim()))
			{
			System.out.println("=======Running firefox in headless========");
			fo.addArguments("--headless");
			}
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) {
			System.out.println("=======Running firefox in incoginto========");
			fo.addArguments("--incognito");
		}
		return fo;
	}
	
	public EdgeOptions getEdgeOptions() {
		eo = new EdgeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) {
			System.out.println("=======Running IE in headless========");
			eo.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) {
			System.out.println("=======Running IE in incognito========");
			eo.addArguments("--incognito");
		}
		return eo;

	}
	
	
	
	
	
	
	
}
	

