package com.api.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <p>Placeholder class level text</p>
 * @Author Siddharth Mishra
 */
public class TestUtils {
	
	public static Properties configProps;
	
	/**
	 * <p>This static method reads configuration parameters</p>
	 * @Version 1.0
	 */
	public static void readConfig() {
		configProps = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("./src/test/resources/config.properties"));
			configProps.load(fis);
			System.out.println(configProps.getProperty("base_uri"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
