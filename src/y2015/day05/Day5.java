package y2015.day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day5 {
	
	static File input = new File(System.getProperty("user.dir")+"/src/y2015/day05/day5input.txt");
	static List<String> niceList = new ArrayList<>();
	static List<String> naughtyList = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner read = new Scanner(input);
		
		ArrayList<String> strings = new ArrayList<>();
		while (read.hasNextLine()){
			strings.add(read.nextLine());
		}
		
		for (String string : strings) {
			if(nice(string)){
				niceList.add(string);
			} else {
				naughtyList.add(string);
			}
		}
		
		System.out.println(niceList.size());

		
	}

	private static boolean nice(String string) {
		
		boolean rtn=false;
		
		Pattern vowels = Pattern.compile("[aeiou]");
		Pattern doubles = Pattern.compile("[a-zA-Z]\\1");
		Pattern naughty = Pattern.compile("(ab)|(cd)|(pq)|(xy)");
		
		if(naughty.matcher(string).matches()) return false;
		
		if(doubles.matcher(string).matches()){
			int vowelCount = 0;
			while(vowels.matcher(string).find()){
				vowelCount++;
			}
			if (vowelCount>=3) {
				rtn=true;
			}
		}
		
		return rtn;
	}

}
