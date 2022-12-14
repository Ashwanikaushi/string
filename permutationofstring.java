import java.io.*;
import java.util.*;

public class permutationofstring {

	public static void solution(String str){
		int n = str.length();
		int f = factorial(n);

		for(int i =0; i<f; i++){
			StringBuilder sb = new StringBuilder(str);
			int tmp =i;
			for(int div = n; div>=1; div--){
				int q = tmp / div;
				int r = tmp % div;

				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				tmp = q;
			}
			System.out.println();
		}
		
	}
	public static int factorial(int n){
		int val = 1;
		for(int i = 2; i<=n; i++){
			val *= i;
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}