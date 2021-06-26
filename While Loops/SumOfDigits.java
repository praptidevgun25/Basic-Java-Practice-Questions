import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
//		while( n != 0) {
//			int digit = n % 10;
//			n = n/10;
//			sum = sum + digit;
//		}
//		
//		System.out.println(sum);
		
		
		int numberOfDigits = (int)Math.log10(n) + 1;
		
		System.out.println(numberOfDigits);
		
	}

}
