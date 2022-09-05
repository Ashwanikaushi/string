import java.io.*;
import java.util.*;

public class removeprimearraylist {
	public static boolean checkPrime(int num){
		for (int fac = 2;fac*fac <= num; fac++){
		if(num%fac == 0)return false;	
		}
		return true;
	}

	public static void removePrime(ArrayList<Integer> list){
		for(int i = list.size()-1; i>=0; i--){
			if(checkPrime(list.get(i))) list.remove(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			list.add(scn.nextInt());
		}
		removePrime(list);
		System.out.println(list);
	}

}