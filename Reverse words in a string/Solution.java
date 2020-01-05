import java.util.*;
import java.io.*;
class Solution{
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(reverseWords(str));
	}
	public static String reverseWords(String str) {
        char sentence[]=str.trim().replaceAll(" +"," ").toCharArray();
		reverse(sentence,0,sentence.length-1);
		int startOfWord=0;
		for(int i=0;i<sentence.length;i++){
			if(sentence[i]==' '){
				reverse(sentence,startOfWord,i-1);
				startOfWord=i+1;
			}
		}
		reverse(sentence,startOfWord,sentence.length-1);
		return String.valueOf(sentence);
    }
	public static void reverse (char array[],int start,int end) {
        if (array == null || start < 0 || start >= array.length || end < 0 || end >= array.length) 
            return;
		while(start<end)
			swap(array,start++,end--);
    }
	private static void swap(char array[],int i,int j){
		char temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}