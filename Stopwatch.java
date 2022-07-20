package logicalprogramming;

import java.util.Scanner;

public class Stopwatch {

	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	// to start timer
	public void start() {
		startTimer = System.currentTimeMillis();

		System.out.println("Start Time is: " + startTimer);
		System.out.println();
	}

	// to stop timer
	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
		System.out.println();
	}

	public long getElapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		Scanner sc = new Scanner(System.in);
		int startSignal, stopSignal;
		do {
			System.out.println("Enter '1' to start time.");
			startSignal = sc.nextInt();
			if (startSignal == 1) {
				System.out.println("Time has been started.");
				sw.start();
				do {
					System.out.println("Enter '2' to stop time.");
					stopSignal = sc.nextInt();
					if (stopSignal == 2) {
						System.out.println("Time has been stopped.");
						sw.stop();
					} else
						System.out.println("Error stopping! Please enter '2'.");
				} while (stopSignal != 2);
			} else
				System.out.println("Error starting! Please enter '1'");
		} while (startSignal != 1);

		long l = sw.getElapsedTime();
		System.out.println("Total Time Elapsed is:" + (l / 1000) + "sec");
		sc.close();
	}
}
