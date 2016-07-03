package edu.xust.zl.discount.strategy;

import java.util.List;

import edu.xust.zl.discount.shoppingcart.GoodsItem;

/**
 * 打折结果计算接口
 * @author ZL
 *@
 */
public interface Discountor {
	/**
	 * 计算折后价的一个接口
	 * @param list
	 * @return
	 */
	public double afterDiscount(List<GoodsItem> list);
}
