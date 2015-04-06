package mikeheke.studycode.designpattern.strategy2;

public class Price {

	private Strategy strategy = null;

	public Price(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double quote(double goodsPrice) {
		return this.strategy.calcPrice(goodsPrice);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
