package mikeheke.studycode.designpattern.strategy2;

public class OldCustomerStrategy implements Strategy {

	public double calcPrice(double goodsPrice) {
		System.out.println("对于老客户，统一折扣5%");
		return goodsPrice*(1-0.05);
	}

}
