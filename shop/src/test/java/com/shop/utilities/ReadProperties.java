package com.shop.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static String URL, userName, password, driverLocation;
	public static void readProperties() throws IOException {
		FileReader file = new FileReader("config.properties");
		Properties properties = new Properties();
		properties.load(file);
		URL = properties.getProperty("URL");
		userName = properties.getProperty("userName");
		password = properties.getProperty("password");
		driverLocation = properties.getProperty("driverLocation");
	}
}