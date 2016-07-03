package edu.xust.zl.discount.shoppingcart;

import edu.xust.zl.discount.Goods;

/**
 * 购物车中商品项目信息
 * @author ZL
 *
 */
public class GoodsItem {
	private Goods goods;
	private double number;
	private double discount;
	private double subPriceAfterDiscount;
	public GoodsItem(Goods goods,double number) {
		this.goods = goods;
		this.number = number;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	public double getSubPriceAfterDiscount() {
		return subPriceAfterDiscount;
	}
	public void setSubPriceAfterDiscount(double subPriceAfterDiscount) {
		this.subPriceAfterDiscount = subPriceAfterDiscount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}
