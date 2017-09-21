package MainClass;

import java.io.*;
import java.util.Scanner;
import WordSearch.WordSearch;

public class ExecutaPrograma {

	public static void main(String[] args) {
		
		Scanner stdin = null;
		try {
			stdin = new Scanner(new File(args[0]));
		} catch(FileNotFoundException e) {
			System.out.println("Couldn't open file \"wordlist.txt\"");
		}
		
		StringBuilder wordList = new StringBuilder();
		while(stdin.hasNext()) {
			wordList.append(stdin.next() + " ");
		}
		wordList.deleteCharAt(wordList.length()-1);
		
		String[] list = wordList.toString().split(" ");
		
		WordSearch w = new WordSearch(list, 40);
		
		System.out.println(w);
		
	}

}
