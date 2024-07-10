package com.qa.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Shopping {
Properties pro;
public Shopping()
{
File src = new File("./Configuration/Configur.properties");
try {
FileInputStream ip = new FileInputStream(src);
pro = new Properties();

	pro.load(ip);
} catch (Exception e) {
	// TODO Auto-generated catch block
System.out.println("Exception is "+e.getMessage());
}
}
public String getURL()
{
	return pro.getProperty("url");
}
}