package com.videoslots;

public class MultiplierOf_4And_6 {


    public static void main(String[] args) {
        System.out.println("multiplier(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) = " + multiplier(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println("multiplier(new int[]{4,6,8,12}) = " + multiplier(new int[]{4, 6, 8, 12}));
        System.out.println("multiplier(new int[]{0,24,24,4,6,6,6,9}) = " + multiplier(new int[]{0,24,24,4, 6, 6, 6, 9}));
        System.out.println("multiplier(new int[] {9,3,2,11,13,5}) = " + multiplier(new int[]{9, 3, 2, 11, 13, 5}));
        System.out.println("Attention:risk for a bug may happen if developer put / instead of % ");
        System.out.println("Attention:risk for a bug may happen if developer put && instead of ||");
        System.out.println("Attention:risk for a bug may happen if developer assign to count variable 1(count=1)");
        System.out.println("multiplier(new int[]{9,2,3,4,5,6,8}) = " + multiplier(new int[]{9, 2, 3, 4, 5, 6, 8}));


    }
    public static int multiplier(int[] numbers){
          int count=0;

        for (int number : numbers) {
            if(number%4==0 || number%6==0 ){
                count++;

            }


        }
        return count;

    }

}
