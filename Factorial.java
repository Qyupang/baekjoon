package recursion;

import java.util.Scanner;

public class Factorial {
	public static int recursion(int num) {
		int result;
		
		if(num <= 1) {
			return 1;
		}
		else {
			result = num * recursion(num-1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num = scan.nextInt();
			int result = recursion(num);
			System.out.println(result);
		}
	}

}

