package com.app.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_Read {
	
	public static void main(String[] args) {
		new Prop_Read().read_prop_reuse("url");
	}

	public void read_prop() {
		try {
			FileReader read = new FileReader( new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\A_July_2025\\src\\test"
					+ "\\resources\\TestData\\config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			String url = prop.getProperty("url");
			System.out.println(url);
			String username = prop.getProperty("username");
			System.out.println(username);
			String password = prop.getProperty("password");
			System.out.println(password);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String read_prop_reuse(String data) {
		
		String value = null;
		try {
			FileReader read = new FileReader( new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\A_July_2025\\src\\test"
					+ "\\resources\\TestData\\config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
}
