package edu.xust.zl.discount.print;

import java.text.DecimalFormat;
import java.util.List;

import edu.xust.zl.discount.shoppingcart.GoodsItem;
/**
 * 打印清单方式的实现
 * @author ZL
 *
 */
public class Print implements  PrintBills{

	private boolean hasDiscount = false;
	private double sumPrice = 0.0;
	private double sumDiscountPrice = 0.0;
	private DecimalFormat df = new DecimalFormat( "0.00");  
	@Override
	public void print(List<GoodsItem> list) {
		//打印明细
		System.out.println("*<没钱赚商店>购物清单*");
		for(int i=0;i<list.size();i++){
			GoodsItem gi = (GoodsItem)list.get(i);
			if(gi.getDiscount()!=1.0){
				System.out.println("名称："+gi.getGoods()+" 数量："+gi.getNumber()+" 单价："+gi.getGoods().getPrice()+" 小计："+df.format(gi.getSubPriceAfterDiscount())+" 优惠："+df.format((gi.getGoods().getPrice()*gi.getNumber()-gi.getSubPriceAfterDiscount())));
				hasDiscount = true;
				sumDiscountPrice+=gi.getGoods().getPrice()*gi.getNumber()-gi.getSubPriceAfterDiscount();
			}else{
				System.out.println("名称："+gi.getGoods()+" 数量："+gi.getNumber()+" 单价："+gi.getGoods().getPrice()+" 小计："+df.format(gi.getSubPriceAfterDiscount()));
				sumPrice+=gi.getSubPriceAfterDiscount();
			}
			sumPrice+=gi.getSubPriceAfterDiscount();
		}
		//打印单品打折商品
		if(hasDiscount){
			System.out.println("——————————————————————————————————————————————————————————————————————————————————");
			System.out.print("单品打折商品：");
			for(int i=0;i<list.size();i++){
				GoodsItem gi = (GoodsItem)list.get(i);
				if(gi.getDiscount()!=1.0){
					System.out.print("名称："+gi.getGoods().getName()+" 折扣："+gi.getDiscount()+"折");	
				}
			}
			System.out.println();
		}
		System.out.println("——————————————————————————————————————————————————————————————————————————————————");
		if(hasDiscount){
			System.out.println("总计："+df.format(sumPrice)+" 节省："+df.format(sumDiscountPrice));
		}else{
			System.out.println("总计："+df.format(sumPrice));
		}
		
	}
}
