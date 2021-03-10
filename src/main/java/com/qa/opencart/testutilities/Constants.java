package com.qa.opencart.testutilities;

import java.util.ArrayList;
import java.util.List;

public class Constants 
{
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String ACCOUNT_PAGE_TITLE = "My Account";
	public static final int ACCOUNT_PAGE_HEADERS_COUNT = 5;
	
	public static List<String> ACCOUNT_PAGE_HEADER_SECTIONS()
	{
		List<String> accntSectionList = new ArrayList<String>();
		accntSectionList.add("My Account");
		accntSectionList.add("My Orders");
		accntSectionList.add("My Affiliate Account");
		accntSectionList.add("Newsletter");
		
		System.out.println(accntSectionList);
		return accntSectionList;
	}


}
