public class PayDesk {

		public void PrintData(double turnover, Type type, double purVal) {
			Card card = new Card(turnover, type);
			double purValue = purVal;
			double discRate = card.CalculateDiscountRate();
			double discount = card.CalculateDiscount(purValue, discRate);
			double total = purValue - discount;
			System.out.print("Card type: "+ card.getType() +"\nPurchase value: $" +purValue
					+"\nDiscount rate: "+discRate
					+"%\nDiscount: $"+discount+
					"\nTotal: $"+total+"\n\n");
		}


}
