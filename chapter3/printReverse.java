public static void printReverse(String word)
{
	    String temp = "";

	    for(int i = word.length() - 1; i >= 0; i--)
	    {
	        temp += word.charAt(i);

	    }
	    System.out.print(temp);
}
