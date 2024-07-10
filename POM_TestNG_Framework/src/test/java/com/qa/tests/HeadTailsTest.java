package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.util.Constant;

public class HeadTailsTest extends BaseTestClass{
@Test
public void headTailsTitleValidation()
{
	String actualTitle = homePage.homePageTitle();
   System.out.println(actualTitle);
   Assert.assertEquals(actualTitle, Constant.HEAD_TAILS_TITLE);
   
   
}
}
