import java.io.*;
import java.util.*;

public class ispallindrome {
	public static boolean isPallindromic(String str){
		int left= 0, right = str.length()-1;
		while(left < right){
		if(str.charAt(left) != str.charAt(right)){
			return false;
		}
		left++;
		right--;
		}
		return true;
	}

	public static void printAllPalindromicSubString(String str){
		for(int sidx =0; sidx<str.length();sidx++){
			for(int eidx = sidx+1; eidx<=str.length();eidx++){
				String ss = str.substring(sidx,eidx);
				if(isPallindromic(ss))
				System.out.println(ss);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printAllPalindromicSubString(str);
	}

}