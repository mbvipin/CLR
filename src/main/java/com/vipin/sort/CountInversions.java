package main.java.com.vipin.sort;

public class CountInversions {

    public static void main (String [] args)
    {
        int [] input =new int [] {7,6,5,4};
        System.out.println(countInversions(input));
    }

    private static int countInversions(int [] input)
    {

        int start=0;
        int end=input.length-1;

        return countInversions(input,0,input.length-1);

    }

    private static int countInversions(int[] input, int start, int end) {

        if(start >= end)
        {
            return 0;
        }

        int mid=(start+end)/2;

        int countFirstHalf=countInversions(input,start,mid);

        int countSecondHalf=countInversions(input,mid+1,end);

        return countFirstHalf+countSecondHalf+ merge(input,start,mid,end);

    }

    private static int merge(int[] input, int start, int mid, int end) {

        int count=0;
        int [] firstHalfArray=new int [mid-start+1];
        int [] secondHalfArray=new int [end -mid];


        int x=0;
        for(int i=start; i<=mid; i++)
        {
            firstHalfArray[x++]=input[i];
        }

        x=0;
        for(int i=mid+1; i<=end; i++)
        {
            secondHalfArray[x++]=input[i];
        }
        int i=0;
        int j=0;

        for( int k=start; k<=end; k++)
        {

            while(i< firstHalfArray.length && j< secondHalfArray.length )
            {
                if(  firstHalfArray[i] <= secondHalfArray[j])
                {
                    input[k]=firstHalfArray[i];
                    i=i+1;
                }

                else
                {
                    count=(mid- i)+1;
                    input[k]=secondHalfArray[j];
                    j=j+1;
                }

            }

            while(i< firstHalfArray.length )
            {
                input[k]=firstHalfArray[i++];
            }

            while(j< secondHalfArray.length )
            {
                input[k]=firstHalfArray[j++];
            }



        }




        return count;
    }
}
