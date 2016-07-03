package edu.xust.zl.discount;

import java.util.ArrayList;
import java.util.List;

import edu.xust.zl.discount.common.DiscountInfoList;
import edu.xust.zl.discount.print.Print;
import edu.xust.zl.discount.print.PrintBills;
import edu.xust.zl.discount.shoppingcart.GoodsItem;
import edu.xust.zl.discount.shoppingcart.ShoppingCart;
import edu.xust.zl.discount.strategy.DiscountInfo;
/**
 * 可根据Discountor接口，实现不同的打折策略，根据DiscountInfo设置不同打折策略的打折详情
 * 根据printBills接口实现打印清单方式，实现需要的打印格式
 * PS:由于时间安排原因，没有充足时间完成说明文档和UML图，抱歉！同时，输入部分由json转为list未实现，打折显示未按要求，显示的是0.9折这种。
 * @author ZL
 *
 */
public class main {
	public static void main(String[] args){
		//初始化基础商品信息
		Goods g1 = new Goods("ITEM000001","可口可乐","瓶","食品","碳酸饮料",3.00);
		Goods g2 = new Goods("ITEM000002","雪碧","瓶","食品","碳酸饮料",3.00);
		Goods g3 = new Goods("ITEM000003","七喜","瓶","食品","碳酸饮料",3.00);
		//初始化打折信息
		DiscountInfo di1 = new DiscountInfo("ITEM000001",0.9);
		DiscountInfo di2 = new DiscountInfo("ITEM000002",0.8);
		DiscountInfo di3 = new DiscountInfo("ITEM000003",0.7);
		//将打折信息传入打折列表
		DiscountInfoList.addDiscountInfo(di1);
		DiscountInfoList.addDiscountInfo(di2);
		DiscountInfoList.addDiscountInfo(di3);
		//初始化购买物品信息
		GoodsItem gi1 = new GoodsItem(g1,1);
		GoodsItem gi2 = new GoodsItem(g2,2);
		GoodsItem gi3 = new GoodsItem(g3,3);
		//将购买物品加入购物车
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addGoods(gi1);
		shoppingCart.addGoods(gi2);
		shoppingCart.addGoods(gi3);
		//调用购物车方法，计算打折后价钱
		double sumPrice = shoppingCart.afterDiscount();
		//打印清单
		PrintBills print = new Print();
		print.print(shoppingCart.getList());
	}
}
