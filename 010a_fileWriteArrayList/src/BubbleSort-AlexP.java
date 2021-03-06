import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileReadArrayList {

	public static void main(String[] args) {
		String filename = "/home/compsci/eclipse-workspace/TextFiles/Kennedy_Cuba_Crisis.txt";
		String line;
		ArrayList<String> alist = new ArrayList<String>();
		String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;-\"?[]' ";
		char[] charAlpha=alpha.toCharArray();
		int[] alphaArray = new int[alpha.length()];
		int unknown=0;
		int temp=0;
		char alphaTemp;
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(filename));
			if(!input.ready()) {
				input.close();
				throw new IOException();
			}
			while((line = input.readLine())!= null) {
				alist.add(line);
			}
			input.close();
		}
		catch (IOException e){
			System.out.println("Error: " + e);
		}
		for(int i=0;i<alpha.length();i++) {
			alphaArray[i]=0;
		}
		
		for(int i=0; i<alist.size();i++){
			String word = alist.get(i).toString().toLowerCase();
			int len = word.length();
			for(int pos = 0; pos<len;pos++) {
				if (!alpha.contains(""+word.charAt(pos))) {
					unknown+=1;
				}
				else {
					alphaArray[alpha.indexOf(word.charAt(pos))] += 1;
				}
			}
		}
		for (int i=0; i<Math.pow(alphaArray.length,2);i++) {
			for(int j=0; j<alphaArray.length-1; j++) {
				if (alphaArray[j]<alphaArray[j+1]) {
					//Sort numbers in array
					temp = alphaArray[j];
					alphaArray[j] = alphaArray[j+1];
					alphaArray[j+1] = temp;
					//Sort Alphabet
					alphaTemp=charAlpha[j];
					charAlpha[j]= charAlpha[j+1];
					charAlpha[j+1]= alphaTemp;
				}
			}
		}
		for(int i=0;i<alpha.length();i++) {
			String bar ="|";
			if (alphaArray[i]!=0) {
				System.out.println(charAlpha[i] + ": " +alphaArray[i]);
			}
		}
		System.out.println("unknown: " + unknown);
		/*
		int sz = alist.size();
		for (int i = 0; i<sz; i++) {
			System.out.println(i+1 + " " + alist.get(i).toString());
		}
		*/
	}

}
