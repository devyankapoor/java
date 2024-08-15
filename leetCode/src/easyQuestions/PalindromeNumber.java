package easyQuestions;

import java.util.Arrays;
import java.util.Stack;

public class PalindromeNumber {

    public boolean isPalineDrome(int x){
      int reverse = 0;
      int temp = x;
        while(temp!=0)
        {
            reverse = (reverse*10) + (temp%10);
            temp = temp/10;
        }
        return (reverse == x);
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalineDrome(121));

    }

}
