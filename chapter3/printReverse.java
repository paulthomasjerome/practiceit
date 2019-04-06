/*
Write a method called printReverse that accepts a String as its parameter and prints
the characters in opposite order. For example, a call of printReverse("hello there!");
should print the following output: !ereht olleh
*/

public static void printReverse(String word)
{
	    String temp = "";
	    int wordLength = word.length();
	    for(int i = wordLength - 1; i >= 0; i--)
	    {
	        temp += word.charAt(i);

	    }
	    System.out.print(temp);
}
