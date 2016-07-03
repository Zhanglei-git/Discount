package edu.xust.zl.discount.common;

import java.util.ArrayList;
import java.util.List;

import edu.xust.zl.discount.Goods;

/**
 * 现有商品信息列表
 * @author ZL
 *
 */
public class GoodsList {
	private static List<Goods> goodsList = new ArrayList<Goods>();

	//注意加同步
	public static void addGoods(Goods goods){
		goodsList.add(goods);
	}
	public static void removeGoods(Goods good){
		goodsList.remove(good);
	}
	public static List<Goods> getGoodsList() {
		return goodsList;
	}

	public static void setGoodsList(List<Goods> goodsList) {
		GoodsList.goodsList = goodsList;
	}
	

}
