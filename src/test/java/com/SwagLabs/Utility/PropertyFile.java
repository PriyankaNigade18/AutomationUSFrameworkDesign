package com.SwagLabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public static Properties p1;
	
	public PropertyFile()
	{
		 p1=new Properties();
		File f1=new File("./"+"\\config\\setupdata.properties");
		try {
			FileInputStream fs=new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
						
	}
	
	
	public static String getProp(String key)
	{
		return p1.getProperty(key);
	}

}
