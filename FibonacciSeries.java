package logicalprogramming;

import java.util.Scanner;

public class FibonacciSeries {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the no. upto which to extend the Fibonacci series: ");
		Scanner scanner = new Scanner(System.in);
		int rev = scanner.nextInt();
		int count = rev - 2;
		System.out.print(n1 + " " + n2);
		printFibonacci(count);
	}

}
