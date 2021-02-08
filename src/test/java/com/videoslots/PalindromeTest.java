package com.videoslots;

public class PalindromeTest {

    public static void main(String[] args) {

        PalindromeAssertion("Aburehim");
        PalindromeAssertion("oko");
        PalindromeAssertion("madam");
        PalindromeAssertion("Tacocat");

        System.out.println("Attention:risk for a bug may happen if developer does not use to lowercase method to str variable");
        System.out.println("Attention:risk for a bug may happen if developer does not use to lowercase method to str variable");
        System.out.println("Attention:risk for a bug may happen if developer does not minus 1 in for loop (str.length()-1) ");
        System.out.println("Attention:risk for a bug may happen if developer use incremental loop (1++) instead of (1--) ");

    }
    public static void PalindromeAssertion(String str){
        String Word="";
        str=str.toLowerCase();

        for(int i=str.length()-1; i>=0; i--){
            Word+=str.charAt(i);

        }
        if(str.equals(Word)){
            System.out.println("This is a palindrome word");
        }
        else {
            System.out.println("This is not palindrome word");
        }

    }
}
