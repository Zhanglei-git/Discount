package edu.xust.zl.discount.common;

import java.util.ArrayList;
import java.util.List;

public class DiscountInfoList {
	private static List discountInfoList = new ArrayList();

	public static void addDiscountInfo(Object o){
		discountInfoList.add(o);
	}
	
	public static void removeDiscountInfo(Object o){
		discountInfoList.remove(o);
	}

	public static List getDiscountInfoList() {
		return discountInfoList;
	}

	public static void setDiscountInfoList(List discountInfoList) {
		DiscountInfoList.discountInfoList = discountInfoList;
	}
	
	public static void clearDiscountInfoList(){
		discountInfoList.clear();
	}
}
