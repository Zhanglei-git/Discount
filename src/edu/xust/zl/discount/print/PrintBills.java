package edu.xust.zl.discount.print;

import java.util.List;

import edu.xust.zl.discount.shoppingcart.GoodsItem;

public interface PrintBills {
	public void print(List<GoodsItem> list);
}
