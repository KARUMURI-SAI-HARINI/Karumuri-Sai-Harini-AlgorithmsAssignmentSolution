package gradedassignment;

import java.util.Scanner;

public class FinancialStockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of companies");
		Scanner sc = new Scanner(System.in);
		int noc = sc.nextInt();
		
		System.out.println("Enter current stock price of the company " + noc);
		double csp = sc.nextDouble();

		System.out.println("Whether company's stock price rose today compare to yesterday?");
		boolean isPriceRose = sc.nextBoolean();
		
		System.out.println("-----------------------------------------------");

		System.out.println("Enter the operation that you want to perform");

		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");

		int option = sc.nextInt();
		
		ascendingOrder ao= new ascendingOrder();
		descendingOrder doo = new descendingOrder();
		searchStock ss = new searchStock();
		stockRose sr = new stockRose();
		stockDecline sd = new stockDecline();

		if (option == 1) {
			ao.ascending();
		} 
		else if (option == 2) {
			doo.descending();
		} 
		else if (option == 3) {
			sr.stockrise();
		} 
		else if (option == 4) {
			sd.stockdec();
		} 
		else if (option == 5) {
			ss.search();
		} 
		else if (option == 6) {
			System.out.println("Exited successfully");
			
		} 
		else {
			System.out.println("Enter the valid option");
		}
	}

}
