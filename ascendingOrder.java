package gradedassignment;

import java.util.Scanner;

public class ascendingOrder extends FinancialStockers {
	public void ascending() {
		int noc, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of companies");
		noc = s.nextInt();
		int csp[] = new int[noc];
		System.out.println("Enter current stock price ofthe company");
		for (int i = 0; i < noc; i++) {
			csp[i] = s.nextInt();
		}
		for (int i = 0; i < noc; i++) {
			for (int j = i + 1; j < noc; j++) {
				if (csp[i] > csp[j]) {
					temp = csp[i];
					csp[i] = csp[j];
					csp[j] = temp;
				}
			}
		}
		System.out.print("Stock price in ascending order are");
		for (int i = 0; i < noc - 1; i++) {
			System.out.print(csp[i] + ",");
		}
		System.out.print(csp[noc - 1]);
	}
	}
