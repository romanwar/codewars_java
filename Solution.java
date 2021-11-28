/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of
3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.*/

import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		//Scanner input = new Scanner(System.in);
		//int i = input.nextInt();
		double sum = 0;
		for(double x = 0; x < i; x++){
			if(x < 0){
				break;
			}else if(x % 5 == 0 || x % 3 == 0){
				if(x % 5 == 0 && x % 3 == 0){
					//System.out.println(x/2);
					sum = sum + x;
				}else{
					sum = sum + x;
				}				
			}
		}
		System.out.println(sum);
	}
}








