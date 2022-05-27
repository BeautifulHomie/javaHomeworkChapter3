
public class CashRegisterTester {

	public static void main(String[] args) 
	{
		CashRegister myRegister = new CashRegister(0.10);

		myRegister.recordPurchase(29.50);
		myRegister.recordTaxablePurchase(9.25);
		myRegister.recordPurchase(4.00);
		myRegister.recordTaxablePurchase(12.15);

	      double totalTax = myRegister.getTotalTax();
	   
	      System.out.println(totalTax);
	      System.out.println("Expected: 2.14");

	      myRegister.receivePayment(58.00);
	      double change = myRegister.giveChange();

	      System.out.println(change);
	      System.out.println("Expected: 0.96");
	   }

}
