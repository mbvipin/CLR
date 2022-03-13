package main.java.com.vipin.sort;

public class NumberConverter {

    public static void main( String [] args)
    {

        System.out.println(binaryToDecimal( decimalToBinary(7)));
        System.out.println(binaryToDecimal(decimalToBinary(10)));

        int [] num= new int [] {1,1,1};

         //System.out.println(num[0] << 0);
       // System.out.println(num[1] << 1);
       // System.out.println(num[2] << 2);



    }

    public static int [] decimalToBinary(int num)
    {
        int [] result=new int [5];

        int i=0;
        while ( num > 0)
        {
            result[i++]=num & 1;
            num=num >> 1;


        }


        return result;
    }

    public static int binaryToDecimal(int[] num)
    {
        int result=0;
        for(int i=0;i< num.length; i++)

        {
            result+=num[i] << i;
        }

        return result;
    }

}
