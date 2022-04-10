package challenge;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long i= sc.nextLong();
		long k=0;
		while(i>0) {
			k+=i%10;
			i=i/10;
		}
		System.out.println(k);
	}
}
