package hasini;

import java.util.Scanner;

public class Firstclass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int i = sc.nextInt();
		sc.close();
		if (i < 35) {
			System.out.println("he/she is fail according to the num");
		} else {
			System.out.println("he or she was passed the exam");
		}
	}

}
