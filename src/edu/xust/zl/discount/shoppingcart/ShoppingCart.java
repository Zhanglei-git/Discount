package edu.xust.zl.discount.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import edu.xust.zl.discount.strategy.DiscountEvery;
import edu.xust.zl.discount.strategy.Discountor;
/**
 * 购物车
 * @author ZL
 *
 */
public class ShoppingCart {
	private List<GoodsItem> list = new ArrayList<GoodsItem>();
	private double sumPrice;
	//Discountor接口实现不同的打折策略
	private Discountor disCountor = new DiscountEvery();
	//计算打折后价钱
	public double afterDiscount(){
		sumPrice = disCountor.afterDiscount(list);
		return sumPrice;
	}
	public void addGoods(GoodsItem goodsItem){
		list.add(goodsItem);
	}
	public void removeGoods(GoodsItem goodsItem){
		list.remove(goodsItem);
	}
	public List<GoodsItem> getList() {
		return list;
	}
	public void setList(List<GoodsItem> list) {
		this.list = list;
	}
	public Discountor getDisCountor() {
		return disCountor;
	}
	public void setDisCountor(Discountor disCountor) {
		this.disCountor = disCountor;
	}
	public double getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}
	
}
