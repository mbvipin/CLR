package main.java.com.vipin.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void  main(String [] args)

    {

        int [] input1=new int [] {7,6,5};
        int [] input2=new int [] {31,41,59,26,41,58};

        sortUsingRecursion(input1);
        sortUsingRecursion(input2);

        //sortReverse(input1);
       // sortReverse(input2);

        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));

    }


    public static void sortUsingRecursion(int [] input)
    {
        sortUsingRecursion(input,input.length-1);
    }

    public static int [] sortUsingRecursion(int [] input,int n)
    {
        if(n<=0)
        {
            return input;
        }

        int [] sortedArray=sortUsingRecursion(input,n-1);

        int newElement=input[n];

        int i=n-1;

        while( i>=0 && input[i]> newElement)
        {
            input[i+1]=input[i];
            i=i-1;
        }

        input[i+1]=newElement;

        return input;


    }

    public static void sort (int [] input) {
        // Assume the first element in sorted order
        // Loop through the rest of elements and insert one by one

        for (int j = 1; j < input.length; j++) {
            int i = j - 1;

            // inserting this new element
            int newElement = input[j];

            // Check the new element and find it's insertion point

            // Time Complexity for Best Case
            // Only one comparison required for each value of j so it becomes linear
            while (i >= 0 && input[i] > newElement) { // Inner code will execute j-1 times ( which is same as i)
                                                      // At jth execution it will exit
                                                      //While loop check, for each j=1 to n-1 will execute j times
                // Sorted elements are from 0 to j-1
                // If element at j-1 is greater than new Element, make room for it by moving to j
                //If element at j-2 is greater than new Element, make room for it by moving to j-1
                // and so on until, loop reached all the way back to 0th element
                // In that case, move it to first element


                // Time Complexity for Worst Case Case
                // For each j, we need to compare against all values in the already sorted array
                // i.e when j=1, compare with j=0
                // when j=2, compare with both j=1,0
                // when j=3, compare with j=2,1,0
                // 1 unit of time+ 2 units of time+3+.....+n-1

                input[i + 1] = input[i];

                // At this point, insertion point is i
                // So next element to compare is i-1
                //We have to compare all the elements before finalizing the insertion point.
                i = i - 1;
            }

            // We will reach this point either when all elements are compared
            // and next element we want to compare doesn't exist i.e i=-1
            // Or All elements from i=i-1 and before are less than new element.
            // So new element is inserted as first element or next element of i-1
            // i.e index is (i-1)+1  i-1=0 or  i-1>0 & i-1 <=j-2
            input[i + 1] = newElement;

        }
    }
        public static void sortReverse (int [] input)

        {
            // Assume the first element in sorted order
            // Loop through the rest of elements and insert one by one

            for(int j=1; j<input.length; j++)
            {
                int i=j-1;

                // inserting this new element
                int newElement=input[j];

                // Check the new element and find it's insertion point
                while( i>=0 && input[i] <newElement)
                {
                    // Sorted elements are from 0 to j-1
                    // If element at j-1 is greater than new Element, make room for it by moving to j
                    //If element at j-2 is greater than new Element, make room for it by moving to j-1
                    // and so on until, loop reached all the way back to 0th element
                    // In that case, move it to first element
                    input[i+1]=input[i];

                    // At this point, insertion point is i
                    // So next element to compare is i-1
                    //We have to compare all the elements before finalizing the insertion point.
                    i=i-1;
                }

                // We will reach this point either when all elements are compared
                // and next element we want to compare doesn't exist i.e i=-1
                // Or All elements from i=i-1 and before are less than new element.
                // So new element is inserted as first element or next element of i-1
                // i.e index is (i-1)+1  i-1=0 or  i-1>0 & i-1 <=j-2
                input[i+1]=newElement;

            }


    }



}
