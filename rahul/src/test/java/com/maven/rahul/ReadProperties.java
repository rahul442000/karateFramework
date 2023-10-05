package com.maven.rahul;

import java.io.*;
import java.util.*;

public class ReadProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		InputStream readfile = null;
		
		try {
			readfile = new FileInputStream("src/test/java/resource/config.properties");
			
			prop.load(readfile);
			
			System.out.println(prop.getProperty("DBServer"));
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			System.out.println(prop.getProperty("Username"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
