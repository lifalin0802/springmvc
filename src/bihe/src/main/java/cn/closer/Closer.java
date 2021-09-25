package cn.closer;

import java.util.Scanner;
import java.util.Stack;

public class Closer {
    public  static void main(String args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        boolean isvalid = isValid(str);
        System.out.println(isvalid);
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char chTop;
            switch (ch){
                case '(': case'{': case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty()) return false;
                    chTop = stack.peek();
                    if(chTop != '('){
                        return false;
                    }
                    else stack.pop();
                    break;
                case '}':
                    if(stack.isEmpty()) return false;
                    chTop = stack.peek();
                    if(chTop != '{'){
                        return false;
                    }
                    else stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty()) return false;
                    chTop = stack.peek();
                    if(chTop != '['){
                        return false;
                    }
                    else stack.pop();
                    break;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
