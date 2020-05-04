package com.app.programs;

public class BaseClass {

	public void LargestWordInStringWithCount(String str) {

		String[] word = str.split(" ");
		String max = " ";
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() >= max.length()) {
				max = word[i];
			}
		}
		System.out.println("Largest Word is: " + max);
		System.out.println("Largest Word Count is :" + max.length());
	}
	
	
	
	public void getTheSmallestWordAndCount(String str)
	{
        String [] words = str.split(" ");
        int smallestWordLen = Integer.MAX_VALUE;
        String smallestWord = "";
        for (int i = 0; i <words.length ; i++) {
            String word = words[i];
            int len = word.length();
           if(len<smallestWordLen) {
                smallestWordLen = len;
                smallestWord = word;
            }
        }
        
        System.out.println("Smallest Word is : " + smallestWord);
        System.out.println("Smallest Word Count is : " + smallestWord.length());
 
	}
	
	
	
	
	
	
	
}
