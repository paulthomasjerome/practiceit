/*
Write a method called printReverse that accepts a String as its parameter and prints
the characters in opposite order. For example, a call of printReverse("hello there!");
should print the following output: !ereht olleh
*/

public static void printReverse(String word)
{
	    String temp = "";

	    for(int i = word.length() - 1; i >= 0; i--)
	    {
	        temp += word.charAt(i);

	    }
	    System.out.print(temp);
}
