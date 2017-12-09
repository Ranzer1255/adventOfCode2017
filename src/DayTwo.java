

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DayTwo {

	static String inputURL = "http://adventofcode.com/2017/day/2/input";
	
	public static void main(String[] args){


		try {
			Scanner read = new Scanner(new File("dayTwoInput"));
			System.out.println(read.nextLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
