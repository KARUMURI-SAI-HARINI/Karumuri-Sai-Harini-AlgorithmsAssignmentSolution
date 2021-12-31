package gradedassignment;

import java.util.Scanner;

public class descendingOrder extends FinancialStockers {
	public void descending() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of companies");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter current stock price of the company");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Stock prices in descending order are:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}
}
