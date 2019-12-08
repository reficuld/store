
public class Card {
	private double turnover;
	private double initialDiscount;
	private Type type;
	
	public Card(double turn, Type ty) {
		this.turnover = turn;
		this.type = ty;
		if(type.equals(Type.Bronze))
			this.initialDiscount = 0;
		if(type.equals(Type.Silver))
			this.initialDiscount = 2;
		if(type.equals(Type.Gold))
			this.initialDiscount = 2;
	}
	
	public double CalculateDiscountRate() {
		double discount = initialDiscount;
		switch(type) {
		case Bronze:
			if(turnover>100 && turnover<301)
				discount = 1;
			if(turnover>300)
				discount = 2.5;
			break;
			
		case Silver:
			if(turnover>300)
				discount = 3.5;
			break;
			
		case Gold:
			int proc = (int)(turnover/100);
			if(proc>8)
				proc = 8;
			discount+=proc;
			break;
		}
		return discount;
	}
	
	public double CalculateDiscount(double purchaseValue, double discRate) {
		return purchaseValue*discRate/100;
	}
	
	public Type getType() {
		return type;
	}
	
}
