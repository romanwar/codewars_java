/*
You live in the city of Cartesia where all roads are laid out in a perfect grid.
You arrived ten minutes too early to an appointment, so you decided to take the
opportunity to go for a short walk. The city provides its citizens with a Walk Generating
App on their phones -- everytime you press the button it sends you an array of one-letter
strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a
single block for each letter (direction) and you know it takes you one minute to traverse one
city block, so create a function that will return true if the walk the app gives you will take
you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your
starting point. Return false otherwise.

Note: you will always receive a valid array containing a random
assortment of direction letters ('n', 's', 'e', or 'w' only). It will never
give you an empty array (that's not a walk, that's standing still!).
*/



public class TenMinWalk{
	public static void main(String[] args){
		// для теста реализовать создание рандомного массива  ['n', 's', 'w', 'e']
		//char[] walk = new char[10];
		char[] walk1 = { 'n','w','n','w','n','w','n','w','n','w'};
/*
'n' - false
'n','s' - false
'n','s','n','s','n','s','n','s','n','s','n','s' -false
'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w' - false
'n','s','n','s','n','s','n','s','n','n' -false
'e','e','e','w','n','s','n','s','e','w' -false
'n','e','n','e','n','e','n','e','n','e' -false
'n','w','n','w','n','w','n','w','n','w' -false
*/ 
		if(isValid(walk1)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}	
		

	}
	
	public static boolean isValid(char[] walk){
		//some code
		if(walk.length != 10){
			return false;
		}
		int[] walkNew = new int[walk.length];
		for(int i = 0; i < walk.length; i++){
			if(walk[i] == 'n' || walk[i] == 'e'){
				walkNew[i] = 1;
			} else{
				walkNew[i] = -1;
			}
		}
		
		int summaY = 0;
		int summaX = 0;
		for(int i = 0; i < walkNew.length; i++){
			//System.out.println(summaX + " : " + summaY);
			//System.out.println(summaY);
			if(walk[i] == 'n' || walk[i] == 's'){
				summaY = summaY + walkNew[i];				
			} else {
				summaX = summaX + walkNew[i];
			}
			//summa = summa + walkNew[i];
		}
		System.out.println(summaX + " : " + summaY);
		if(summaY == 0 && summaX == 0){
			return true;
		} else{
			return false;
		}

		
    }
	
	
}


/*
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;
    
    int x = 0, y = 0;
    for (char c: walk) {
      switch (c) {
        case 'n': y++; break;
        case 's': y--; break;
        case 'w': x++; break;
        case 'e': x--; break;
      }
    }
    
    return x == 0 && y == 0;
  }
}
*/
