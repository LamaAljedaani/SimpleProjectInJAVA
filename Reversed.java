/*
 *  the purpose of this project is to create a method
 *   that take a string then, return the reversed of 
 *   the string in a char array
 *   for exmaple:
 *   Lama => amaL
 * 
 */

public class Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] x = spinWords("lama taha");
		for(char i : x) {
			System.out.print(i);
		}
	}
	
	public static char[] spinWords(String x) {
		
		char[] charArray = x.toCharArray();
		
		// find the number;
		char reversed[]= new char[charArray.length];
		int index = 0;
		for(int i = (charArray.length-1); i>=0; i-- ) {
			reversed[index] = charArray[i];
			index++;
		}
		return reversed;
	}

}
