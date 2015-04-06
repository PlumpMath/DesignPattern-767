package mikeheke.studycode.designpattern.strategy2;

public class CooperateCustomerStrategy implements Strategy {

	public double calcPrice(double goodsPrice) {
		System.out.println("对于企业合作伙伴，统一打八折");
		return goodsPrice*(1-0.2);
	}

}
