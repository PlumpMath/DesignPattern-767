package mikeheke.studycode.designpattern.strategy2;

public class NormalCustomerStrategy implements Strategy {

	public double calcPrice(double goodsPrice) {
		System.out.println("对于新客户或普通客户，没有折扣。");
		return goodsPrice;
	}

}
