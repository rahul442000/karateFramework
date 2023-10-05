package com.maven.rahul;

import java.io.*;
import java.util.*;

public class WriteProperties {

	public static void main(String[] args) {


		Properties prop = new Properties();
		OutputStream writefile = null;
		
		try {
			writefile = new FileOutputStream("src/test/java/resource/config.properties");
			
			prop.setProperty("DBServer", "ins01.kurl02.rahul");
			prop.setProperty("DBName", "db.rahul");
			prop.setProperty("DBPass", "JaiBhole");
			prop.setProperty("Username", "root");
			
			prop.store(writefile, null);
			System.out.println("Created properties Successfully");
			
		}catch(IOException io) {
			io.printStackTrace();
		} finally {
			if(writefile != null ) {
				try {
					writefile.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
