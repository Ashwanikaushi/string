import java.io.*;
import java.util.*;

public class togglecase {
	public static String toggleCase(String str){
		String ans = "";
		for(int i =0; i< str.length(); i++){
			char ch = str.charAt(i);
			// 'a' - LC = 'A' - UC
			if(ch >= 'a' && ch <= 'z'){
				// lower case
				char uc = (char)('A' + (ch - 'a'));
				ans = ans + uc;
			}else if(ch >= 'A' && ch <= 'Z'){
				char lc = (char)('a' + (ch - 'A'));
				ans = ans + lc;
			}
		}
		return ans;
	}

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}