package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		int number = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < number; i++) {
			String name = sc.nextLine();
			list.add(name);
		}
		
		System.out.print("Hello ");
		
		System.out.print(list.get(0));
		
		for (int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));			
		}
		
		System.out.print(".");
		
		sc.close();
	}

}
