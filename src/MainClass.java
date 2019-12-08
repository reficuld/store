
public class MainClass {

	public static void main(String[] args) {
		
		PayDesk pay = new PayDesk();
		pay.PrintData(0.0, Type.Bronze, 150.0);
		pay.PrintData(600.0, Type.Silver, 850.0);
		pay.PrintData(1500.0, Type.Gold, 1300.0);
	}

}
