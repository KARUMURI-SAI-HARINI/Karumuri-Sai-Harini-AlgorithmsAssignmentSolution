package gradedassignment;

import java.util.Scanner;

public class searchStock extends FinancialStockers {
	public void search() {
		int n, x, flag = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of companies:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter current stock price ofthe company:");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the key value:");
		x = s.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] == x) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("Stock value is present");
		} else {
			System.out.println("Value not found");
		}
	}
}
