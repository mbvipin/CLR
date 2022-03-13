package main.java.com.vipin.sort;

public class FindSubArrayWithMaxSum {


    class MaxSubArray {

        int leftIndex;
        int rightIndex;

        int sum;

        MaxSubArray(int leftIndex,int rightIndex,int sum)
        {

            this.leftIndex=leftIndex;
            this.rightIndex=rightIndex;
            this.sum=sum;
        }

    }

    public static void main(String [] args)
    {
        int [] input=new int [] {67,23,22,11,11,44};

        int [] input1=new int [] {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};

        int [] input2=new int [] {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};

        int [] input3=new int [] {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};




        FindSubArrayWithMaxSum maxSumSubArray=new FindSubArrayWithMaxSum();

        long startTime=System.nanoTime();
        MaxSubArray maxSubArrayResult1=maxSumSubArray.findMaxSubArray(input3);
        System.out.println(" Sub Array with maximum sum starts at "+maxSubArrayResult1.leftIndex+" and ends at "+maxSubArrayResult1.rightIndex+" and the sum is "+maxSubArrayResult1.sum);
        System.out.println(System.nanoTime()-startTime);

        long startTime1=System.nanoTime();
        MaxSubArray maxSubArrayResult2=maxSumSubArray.findMaxSubArrayBruteForce(input3);
        System.out.println(" Sub Array with maximum sum starts at "+maxSubArrayResult2.leftIndex+" and ends at "+maxSubArrayResult2.rightIndex+" and the sum is "+maxSubArrayResult2.sum);
        System.out.println(System.nanoTime()-startTime1);

        long startTime2=System.nanoTime();
        MaxSubArray maxSubArrayResult3=maxSumSubArray.findMaxSubArrayLinear(input3);
        System.out.println(" Sub Array with maximum sum starts at "+maxSubArrayResult3.leftIndex+" and ends at "+maxSubArrayResult3.rightIndex+" and the sum is "+maxSubArrayResult3.sum);
        System.out.println(System.nanoTime()-startTime2);




    }

    private MaxSubArray findMaxSubArrayBruteForce(int [] input)
    {
        int maxSum=Integer.MIN_VALUE;

        int leftIndex=0;
        int rightIndex=0;

        for(int i=0; i< input.length-1; i++)
        {
            int sum=0;
            for(int j=i; j< input.length-1; j++)
            {
                sum+=input[j];

                if(sum>maxSum )
                {
                    maxSum=sum;
                    leftIndex=i;
                    rightIndex=j;
                }

            }
        }


     return  new MaxSubArray(leftIndex,rightIndex,maxSum);
    }

    private MaxSubArray findMaxSubArrayLinear(int [] input)
    {
        int maxSum=Integer.MIN_VALUE;

        int currentLeft=0;
        int leftIndex=0;
        int rightIndex=0;

        int currentSum=0;

        for(int i=0; i< input.length-1; i++)
        {
            currentSum+=input[i];

            if(currentSum > maxSum)
            {
                leftIndex=currentLeft;
                maxSum=currentSum;
                rightIndex=i;

            }

            if(currentSum < 0)
            {
                currentSum=0;
                currentLeft=currentLeft+1;

            }


        }


        return  new MaxSubArray(leftIndex,rightIndex,maxSum);
    }



    private  MaxSubArray findMaxSubArray(int[] input) {

  return findMaxSubArray(input,0,input.length-1);

    }

    private  MaxSubArray findMaxSubArray (int[] input,int start,int end)
    {
        if(start== end)
        {
            return new MaxSubArray(start,end,input[start]);
        }

        int mid=(start+end)/2;

        MaxSubArray maxLeftSum=findMaxSubArray(input,start,mid);

        MaxSubArray maxRightSum=findMaxSubArray(input,mid+1,end);

        MaxSubArray maxCrossSum=findCrossSum(input,start,end);

        if( (maxLeftSum.sum > maxRightSum.sum) && (maxLeftSum.sum > maxCrossSum.sum) )
        {
            return maxLeftSum;
        }

        else if( (maxRightSum.sum > maxLeftSum.sum) && (maxRightSum.sum  > maxCrossSum.sum) )
        {
            return maxRightSum;
        }

        else
        {
            return maxCrossSum;
        }




    }

    private  MaxSubArray findCrossSum(int[] input, int start, int end) {

        int mid= (start+end)/2;

        int i=mid;
        int maxLeftSumIndex=i;
        int leftSum=0;
        int maxLeftSum=Integer.MIN_VALUE;
        while( i>=start)
        {
            leftSum+=input[i];

            if(leftSum> maxLeftSum)
            {
                maxLeftSum=leftSum;
                maxLeftSumIndex=i;
            }

            i--;

        }

        int j=mid+1;
        int maxRightSumIndex=j;
        int rightSum=0;
        int maxRightSum=Integer.MIN_VALUE;

        while(j <=end)
        {
            rightSum+=input[j];
            if(rightSum> maxRightSum)
            {
                maxRightSumIndex=j;
                maxRightSum=rightSum;
            }
          j++;

        }


   return new MaxSubArray(maxLeftSumIndex,maxRightSumIndex,maxLeftSum+maxRightSum);
    }




}
