package seleniumtutorials;

import java.util.HashMap;
import java.util.Map;

public class HowToUseHashMapInseleniumWebDriver50 {

	public static Map<String, String> getUserLoginInfo() {
		
		Map<String,String> userMap = new HashMap<String,String>();
		userMap.put("customer", "chinmay010_consultadd");
		userMap.put("admin", "naveenk_test@123");
		return userMap;
	}
	
	public static Map<Integer, String> getMonthFromUser(){
		Map<Integer,String> userMonth = new HashMap<Integer,String>();
		userMonth.put(1, "january");
		userMonth.put(2, "February");
		userMonth.put(3, "March");
		userMonth.put(4, "April");
		userMonth.put(5, "May");
		userMonth.put(6, "June");
		userMonth.put(7, "July");
		userMonth.put(8, "August");
		userMonth.put(9, "September");
		userMonth.put(10, "October");
		userMonth.put(11, "November");
		userMonth.put(12, "December");
		return userMonth;
	}
	

	}


