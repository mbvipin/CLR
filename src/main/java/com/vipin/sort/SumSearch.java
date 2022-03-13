package main.java.com.vipin.sort;

public class SumSearch {

    public static void main(String[] args) {

        int [] input=new int [] {34,89,65,54,33,89,53,22,40};

        System.out.println(sumSearch(input,76));
        System.out.println(sumSearch(input,200));

        System.out.println(sumSearchPlus(input,76));
        System.out.println(sumSearchPlus(input,200));

    }

    public static boolean sumSearchPlus(int [] input,int x)
    {
        int low=0;
        int high=input.length-1;

        while(low< high)
        {
            int sum=input[low]+input[high];

            if(sum==x)
            {
                return true;
            }

            if(sum > x)
            {
                high=high-1;
            }

            if(sum<x)
            {
                low=low+1;
            }

        }

        return false;

    }


    public static boolean sumSearch(int[] input, int x) {

        MergeSort.sort(input);

        for (int i = 0; i < input.length; i++) {
            int index = BinarySearch.findIteratively(input, x - input[i]);
            if (index != -1 && index != i) {
                return true;
            }
        }

      return false;
    }
}
