package mikeheke.studycode.designpattern.strategy2;

public class StrategyClient2 {

	public static void main(String[] args) {
		//1.
		Strategy strategy = new OldCustomerStrategy();
		//2.
		Price ctx = new Price(strategy);
		//3.
		double quote = ctx.quote(1000);
		System.out.println("向客户报价: "+quote);
		
		ctx.setStrategy(new LargeCustomerStrategy());
		System.out.println("向客户报价: "+ctx.quote(1000));
		
		ctx.setStrategy(new CooperateCustomerStrategy());
		System.out.println("向客户报价: "+ctx.quote(1000));
	}

}
