package y2017.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4 {
	
	static File input = new File("C:/Users/jrdillingham.MABANKISD/Programing/workspace/adventofcode/src/day04/Day4Input");
	static List<String> passphrases = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(input)){
			while(read.hasNextLine()){
				passphrases.add(read.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int validPhrases = checkPassphrases();
		System.out.println("Part 1: "+validPhrases);
		
	}

	private static int checkPassphrases() {
		int rtn = 0;
		
		nextword:for (String phrase : passphrases) {
			String [] words = phrase.split("\\s");
			for (int i = 0; i < words.length; i++) {
				for (int j = i+1; j < words.length; j++) {
					if(words[i].equals(words[j]))
						continue nextword;
				}
			}
			rtn++;
		}
		
		return rtn;
	}
	
	
}
