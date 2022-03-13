package main.java.com.vipin.sort;


import java.util.Arrays;

public class SelectionSort {

    public static void main(String [] args)
    {

        int [] input1=new int [] {7,6,5};
        int [] input2=new int [] {31,41,59,26,41,58};

        sort(input1);
        sort(input2);

        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
    }

    public static void sort(int [] input)

    {
        // For i= 0 to n-2
        // Initialize the smallest element as the one at i=0
        //  define j=i+1 to n-1 and find the smallest element
        // Swap with element at i
        // Increment i
        // Continue Loop

        // Loop Invariant A[0 to i] is sorted.

        for(int i=0; i< input.length-1; i++)
        {
            int nextSmallestElement=input[i];
            boolean isSmallestUpdated=false;
            int indexOfNextSmallestElement=i;

            for(int j=i+1; j< input.length; j++)
            {
                if(input[j]<nextSmallestElement )
                {
                    nextSmallestElement=input[j];
                    isSmallestUpdated=true;
                    indexOfNextSmallestElement=j;
                }
            }

            if(isSmallestUpdated)
            {
                int temp=input[i];
                input[i]=nextSmallestElement;
                input[indexOfNextSmallestElement]=temp;
            }

        }

    }
}
