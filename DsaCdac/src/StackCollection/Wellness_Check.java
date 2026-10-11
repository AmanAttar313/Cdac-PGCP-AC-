package StackCollection;

import java.util.Scanner;
import java.util.Stack;
 
public class Wellness_Check
{
	static boolean check(String pattern)
    {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(c=='{')
                stack.push(c);
            if(c=='}')
            {
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }
        return(stack.isEmpty());//If true then true. If false then false.
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String pattern;

        System.out.println("Enter pattern to check:");
        pattern = sc.next();

        System.out.print("\nPattern is balanced:" + check(pattern));
    }

}

