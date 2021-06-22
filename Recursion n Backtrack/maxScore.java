import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		if(idx == words.length)
		{
		    return 0;
		}
		
		int sno = solution(words, farr, score, idx+1);
		
		int yes = 0 ;
		String wrd = words[idx];
		boolean flag = true ;
		for(int i = 0 ; i < wrd.length() ; i++)
		{
		    char ch = wrd.charAt(i);
		    if(farr[ch-'a'] == 0)
		    {
		        flag = false ;
		    }
		    farr[ch-'a']--;
		    yes+=score[ch-'a'];
		}
		int syes = 0 ;
		if(flag)
		{
		    syes = yes + solution(words, farr, score, idx+1);
		}
				for(int i = 0 ; i < wrd.length() ; i++)
		{
		     char ch = wrd.charAt(i);
		     farr[ch-'a']++;
		}
		
		return Math.max(syes,sno);
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}
}
