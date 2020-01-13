
public class FinancialBook extends BookStatistics {

	private int image_price = 10;
	public void print_price()
	{
		System.out.println("Prices: ");
		System.out.println("Images price: " + numberOfImages*image_price);
	}
}
