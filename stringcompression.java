import java.io.*;
import java.util.*;

public class stringcompression {

	public static String compression1(String str){
		String ans = ""+str.charAt(0);
		int idx = 1;
		while(idx < str.length()){
			char curr = str.charAt(idx);
			char prev = str.charAt(idx-1);
			if(curr == prev){
				// do nothing
			}else{
				ans = ans+curr;
			}
			idx++;
		}
		

		return ans;
	}

	public static String compression2(String str){
		String ans = ""+str.charAt(0);
		int idx = 1; 
		int count = 1;
		while(idx<str.length()){
			char curr = str.charAt(idx);
			char prev = str.charAt(idx-1);
			if(curr == prev){
				count++;
			}else{
				if(count>1){
			ans = ans + count;
		}
				ans = ans + curr;
				count = 1;
			}
			idx++;
		}
		if(count>1){
			ans = ans + count;
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}