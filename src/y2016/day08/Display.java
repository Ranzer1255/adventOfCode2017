package y2016.day08;


/**
 * To get past the door, you first swipe a keycard 
 * (no problem; there was one on a nearby desk).
 * Then, it displays a code on a little screen, 
 * and you type that code on a keypad. Then, presumably, the door unlocks.
 * 
 * Unfortunately, the screen has been smashed. After a few minutes, 
 * you've taken everything apart and figured out how it works. 
 * Now you just have to work out what the screen would have displayed.
 * 
 * The magnetic strip on the card you swiped encodes 
 * a series of instructions for the screen; these instructions 
 * are your puzzle input. The screen is 50 pixels wide and 6 pixels tall, 
 * all of which start off, and is capable of three somewhat peculiar operations:
 * 
 * @author jrdillingham
 *
 */
public class Display {
	
	
	int[][] screen = new int[6][50];
	
	/**
	 * rect AxB turns on all of 
	 * the pixels in a rectangle at 
	 * the top-left of the screen 
	 * which is A wide and B tall.
	 * @param a
	 * @param b
	 */
	public void rect(int a, int b){
		//TODO
	}
	
	/**
	 * rotate row y=row by shift 
	 * 
	 * shifts all of the pixels in row A
	 * (0 is the top row) right by B pixels.
	 * Pixels that would fall off the right end appear
	 * at the left end of the row.
	 * 
	 * @param row
	 * @param shift
	 */
	public void rotateRow(int row, int shift){
		//TODO
	}
	
	/**
	 * rotate column x=col by shift
	 * 
	 * shifts all of the pixels in column col 
	 * (0 is the left column) down by shift pixels.
	 * Pixels that would fall off the bottom appear at the top of the column.
	 * 
	 * @param col
	 * @param shift
	 */
	public void rotateCol(int col, int shift){
		//TODO
	}
	
	/**
	 * 0,0 is top right corner
	 * 
	 * @return
	 */
	public String getDisplay(){
		//TODO return display string
		return "";
	}
	
	
	
	public int getLights(){
		//TODO return number of lit pixels
		return -1;
	}

}
