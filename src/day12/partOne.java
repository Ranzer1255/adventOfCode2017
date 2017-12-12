package day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class partOne {
	
	public static File inputFile = new File("/adventofcode/src/day12/day12input");

	public static void main(String[] args) {
		
		Map<Integer,Program> tree = generateTree(inputFile);
		
	}

	private static Map<Integer, Program> generateTree(File input) {
		HashMap<Integer,Program> rtn = new HashMap<>();
		
		try (Scanner read = new Scanner(input)){
			
			while (read.hasNextLine()){
				String parse = read.nextLine();
				System.out.println(parse);
				
				
				
				int id=0;
				
				if(rtn.get(id)!=null){
					
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rtn;
	}
	
	
}
