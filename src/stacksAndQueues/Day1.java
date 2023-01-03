package stacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class Day1 {
    // reverse a string using stack
    public static void main(String[] args) {
        String s = "abcde";
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }
        while(st.size() > 0){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
