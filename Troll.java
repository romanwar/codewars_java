/*
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

public class Troll{
	public static void main(String[] args){
		String message = "No offense but,\nYour writing is among the worst I've ever read";
		System.out.println(disemvowel(message));
	}
	
	public static String disemvowel(String str) {
		String newMessage = "";
		StringBuilder builder = new StringBuilder(newMessage);
		for (int i = 0; i < str.length(); i++){
			String newStr = "" + str.charAt(i);
			if(newStr.matches("^(?i:[aeiou]).*")){
				continue;
			}else{
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
    }
	
}

/*
//classic solutions
public class Troll {
    public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
}

/*

/*
Что узнал.
Тип данных String не изменяемый. Для возможности изменения создан класс StringBuilder*/