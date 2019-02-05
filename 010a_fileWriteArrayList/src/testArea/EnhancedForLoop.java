package testArea;

import java.util.ArrayList;
import java.util.List;

//array for loop
public class EnhancedForLoop {
	public static void main(String[] args) {
		int nums[] = {3,4,5,6,7};
		int total = 0;
		
		List<String> StringList = new ArrayList<String>();
		
		int a=5, b=6, c=7, d=8;
		int x[]= {5,6,7,8};
		int y[]= {6,7,8,9};
		int z[]= {9,8,7,6};
		
		int p[][] = {
				
				{5,6,7,8},
				{6,7,8,9},
				{9,8,7,6}
				
		};
		//2D Array
		
		for(int i[]:p) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		/*
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.print("");
		}
		*/
		
		// ArrayList
		StringList.add("AAA");
		StringList.add("BBB");
		StringList.add("CCC");
		StringList.add("DDD");
		StringList.add("EEE");
		StringList.add("FFF");
		StringList.add("GGG");
		StringList.add("HHH");
		/*
		for(int i=0;i< StringList.size(); i++) {
			System.out.println(StringList.get(i));
		}
		*/
		for(String s: StringList) {
			System.out.println(s);
		}
		
		System.out.println("\n" + StringList.remove(0));
		
		System.out.println("\nList items: ");
		/*
		for(int i=0; i< StringList.size(); i++) {
			System.out.println(StringList.get(i));
		}
		*/
		for(String s: StringList) {
			System.out.println(s);
		}
		
		//Array
		for(int n: nums) {
			total += n;
		}
		System.out.println(total);
		
	}
}
