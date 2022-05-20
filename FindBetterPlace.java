package algorithms;

import java.util.Scanner;

public class FindBetterPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int R = Integer.parseInt(input[2]);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] x = new int[N];
		int[] y = new int[N];
		
		for (int i = 0; i < N; i++) {
			input = sc.nextLine().split(" ");
			x[i] = Integer.parseInt(input[0]);
			y[i] = Integer.parseInt(input[1]);
		}
		
		for (int i = 0; i < N; i++) {
			if (Math.pow(x[i] - a, 2) + Math.pow(y[i] - b, 2) >= Math.pow(R, 2)) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}
		
		sc.close();
	}

}
