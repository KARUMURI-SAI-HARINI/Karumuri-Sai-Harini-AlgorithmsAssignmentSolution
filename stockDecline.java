package gradedassignment;

import java.util.Scanner;

public class stockDecline extends FinancialStockers {
	public void stockdec() {
		Scanner sc = new Scanner(System.in);

		boolean isPriceRose = sc.nextBoolean();
		if (isPriceRose == true) {
			System.out.println("Total no of companies whose stock price declined today : 1");
		} else {
			System.out.println("Total no of companies whose stock price declined today : 0");
		}
	}
}
