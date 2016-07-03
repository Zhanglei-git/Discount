package edu.xust.zl.discount.strategy;

import java.util.Iterator;
import java.util.List;

import edu.xust.zl.discount.common.DiscountInfoList;
import edu.xust.zl.discount.shoppingcart.GoodsItem;
/**
 * 打折策略的实现
 * @author ZL
 *
 */
public class DiscountEvery implements Discountor{

	@Override
	//按照打折策略计算
	public double afterDiscount(List<GoodsItem> list) {
		List<DiscountInfo> disInfoList = (List<DiscountInfo>)DiscountInfoList.getDiscountInfoList();
		for(int i=0;i<list.size();i++){
			GoodsItem gi = (GoodsItem)list.get(i);
			double discount = queryDiscount(gi.getGoods().getBarcode());
			gi.setSubPriceAfterDiscount(gi.getGoods().getPrice()*gi.getNumber()*discount);
			gi.setDiscount(discount);
			list.set(i, gi);
		}
		return 0;
	}
	//查询是否有折扣
	private double queryDiscount(String barcode){
		boolean isFind = false;
		double discount = 1.0;
		if(!"".equals(barcode)&&barcode!=null){
			Iterator it = DiscountInfoList.getDiscountInfoList().iterator();
			while(it.hasNext()&&(!isFind)){
				DiscountInfo di = (DiscountInfo)it.next();
				if(barcode.equals(di.getBarcode())){
					isFind = true;
					discount = di.getDiscount();
				}
			}	
		}
		return discount;
	}
}
