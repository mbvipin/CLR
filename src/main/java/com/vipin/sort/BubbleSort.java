package main.java.com.vipin.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] input1=new int [] {7,6,5,4,3,2,1};
        int [] input2=new int [] {1,2,3,4,5,6,7};
        int [] input3=new int [] {4,3,2,1,7,6,5};
        int [] input4=new int [] {1,2,3,4,7,6,5};
        int [] input5=new int [] {7,6,5,4,1,2,3};

        sort(input1);
        sort(input2);
        sort(input3);
        sort(input4);
        sort(input5);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
        System.out.println(Arrays.toString(input4));
        System.out.println(Arrays.toString(input5));


    }

    public static void sort(int[] input) {

        for (int i = 0; i <= input.length - 2; i++) {

            // Loop Invariant:  Start with j= last index and go till second element.
            // For j= each index, compare with previous element and swap if element is less
            // For the loop termination, when j= i+1(second element), i=0 will have the smallest element.
            // Then i=0 is locked with the smallest element.
            // After this  i is incremented, and j loop repeats till i+1th element
            // i loop repeats till second to last element where second to last smallest element will be chosen.
            for (int j = input.length - 1; j >= i + 1; j--) {

                if(input[j] <input[j-1])
                {
                    int temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }

            }

        }
    }

}
