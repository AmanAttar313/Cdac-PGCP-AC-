package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class CountingVowels {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> vowels=new HashMap<>();
		vowels.put('a',0);
        vowels.put('e',0);
        vowels.put('i',0);
        vowels.put('o',0);
        vowels.put('u',0);
        //Accept a line of string from the user.
        System.out.println("Enter Line : ");
        String line=sc.nextLine();
        int count=0;
        
        //Using some system access, one character at a time 
        for(int i=0;i<line.length();i++) {
        	
        	 //If it is part of the dictionary set that value + 1 to `earlier`.
        	if(vowels.containsKey(line.charAt(i))) {
        		count=vowels.get(line.charAt(i)); 
        		count++;
        		vowels.put(line.charAt(i), count);
        		}
        }
       
        
        
        //Finally print each individual character along with the count.
        //System.out.println(vowels);
        		//OR
        //
        for(Character c:vowels.keySet()) {
        	System.out.println(c+":"+vowels.get(c));

        }

		
	}
}
