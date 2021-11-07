/*Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
However, the arrays can have varying lengths, not just limited to 4.*/

import java.util.ArrayList;

public class BinaryArrayToNumber{
	public static void main(String[] args){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(1);
		myArray.add(1);
		myArray.add(1);
		myArray.add(0);
		//int [] myArray = new int[sizeArray];
		System.out.println(ConvertBinaryArrayToInt(myArray));

		
	}
	
	public static int ConvertBinaryArrayToInt(ArrayList<Integer> binary) {
	//public static double ConvertBinaryArrayToInt(int[] Array) {	
		int summ = 0;
		int arrayLen = binary.size();
		for(int i = 0; i < arrayLen; i++){
			summ = summ + (int)(Math.pow(2, arrayLen - i - 1)) * binary.get(i);
		}
		return summ;     
		
    }
	
}
