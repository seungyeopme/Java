package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer(100010, "Lee");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " +customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " +customerKim.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(10010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " +customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}
}