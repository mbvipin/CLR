package main.java.com.vipin.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String [] args)
    {
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

    public static void sort(int [] inputArray)
    {
        sort(inputArray,0,inputArray.length-1);

    }

    private static void sort(int [] inputArray,int start,int end)
    {
        // Start= end means there is only one element and we can't divide further.
        // Mid will evaluate to start=end and will continue the infinite loop.
        if(start >=end)
        {
            return;
        }
        // Find the mid point of the array.
        int mid=(start+end)/2;

        // New Recursive call from start to mid.
        // 0-6(mid=3), 0-3(mid=1),0-1(mid=0)
        // (0,3)--> (0,1)--> (0,0)
        sort(inputArray,start,mid);
        // (1,1)
        sort(inputArray,mid+1,end);
        // (0,3)--> (0,1) & (2,3)
        // (0,1) -->(0,0) & (1,1)
        // (2,3)--> (2,2) & (3,3)
        // (4,6)--> (4,5) & (5,6)
        // (4,5)--> (4,4) & (5,5)
        // (5,6)--> (5,5) & (6,6)
        combine(inputArray,start,mid,end);


    }

    private static void combine(int [] array, int startPoint,int midPoint,int endPoint) {

        // First array is from start point to midpoint ( so it has midpoint-startpoint elements)
        int firstArrayLength = midPoint - startPoint + 1;
        // Second array is from midpoint+1 to endpoint ( so it has endpoint-(midpoint+1)+1 elements)
        int secondArrayLength = endPoint-midPoint;

        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[secondArrayLength];

        int indexForFirstArray=0;
        int indexForSecondArray=0;

        // Copy Elements from startpoint to mid point to first array
        for (int k = startPoint; k <= midPoint; k++)
        {
            firstArray[indexForFirstArray]=array[k];
            indexForFirstArray=indexForFirstArray+1;
        }

        // Copy Elements from midpoint+1 to end point to second array
        for (int k =midPoint+1; k <= endPoint; k++)
        {
            secondArray[indexForSecondArray]=array[k];
            indexForSecondArray=indexForSecondArray+1;
        }

         int i=0;
         int j=0;

         // Find the correct element for each position in the original array
        for(int k=startPoint; k<=endPoint; k++)
        {
            // If we are already done with first array and not done with second array
            if(i>=firstArray.length && j< secondArray.length)
            {
                // Append all the elements from second array to
                array[k]=secondArray[j];
                j=j+1;
                continue;
            }

            // If we are already done with second array and not done with first array
            else if( j>=secondArray.length && i< firstArray.length)

            {
                array[k]=firstArray[i];
                i=i+1;
                continue;
            }

            // Both arrays are non empty
            // Choose smallest element from either array and move to the next element
            else if((firstArray[i] <= secondArray[j])  )
            {
                array[k]=firstArray[i];
                i=i+1;
            }
            else
            {
                array[k]=secondArray[j];
                j=j+1;
            }

        }


    }
}
