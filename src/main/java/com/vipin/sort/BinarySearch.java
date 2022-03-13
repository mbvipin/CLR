package main.java.com.vipin.sort;

public class BinarySearch {

    public static void main(String [] args)
    {
        int [] input=new int [] {34,89,65,54,33,89,53,22,40};

        System.out.println(findRecursively(input,54));
        System.out.println(findIteratively(input,54));

    }

    public static int findRecursively(int [] input,int value)
    {
        MergeSort.sort(input);
        return findRecursively(input,value,0,input.length-1);
    }

    public static int findRecursively(int [] input,int value, int low,int high)
    {
        if(low > high)
        {
            return -1;
        }
        int result=-1;
          int mid=(low+high)/2;

        if(input[mid]== value)
        {
            result=mid;
        }

        else if(input[mid] > value)
        {
            result=findRecursively(input,value,low,mid-1);
        }

        else
        {
            result=findRecursively(input,value,mid+1,high);
        }


        return result;
    }

    public static int findIteratively(int [] input,int value)
    {

        MergeSort.sort(input);

        int low=0;
        int high=input.length-1;

        while(low <=high)
        {
           int mid=(low+high)/2;

           if(input[mid]== value)
           {
               return mid;
           }

           else if(input[mid] > value)
           {
               high=mid-1;
           }

           else
           {
               low=mid+1;
           }

        }


        return -1;
    }
}
