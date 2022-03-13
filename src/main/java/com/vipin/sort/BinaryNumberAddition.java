package main.java.com.vipin.sort;

public class BinaryNumberAddition {

    public static void  main(String [] args)

    {


        int[] result=add(NumberConverter.decimalToBinary(1),NumberConverter.decimalToBinary(2));

        System.out.println(NumberConverter.binaryToDecimal(result));

        result=add(NumberConverter.decimalToBinary(5),NumberConverter.decimalToBinary(1));

        System.out.println(NumberConverter.binaryToDecimal(result));
        result= add(NumberConverter.decimalToBinary(9),NumberConverter.decimalToBinary(1));

        System.out.println(NumberConverter.binaryToDecimal(result));


        // 0 to n-1
        // n-1 is the most significant bit
        // so 1 is represented as 1 0 0
        // 2 is represented as 0 1 0
        int [] input7=new int [] {1,0,0,1};

        int [] input8=new int [] {1};

        result=add(input7,input8);

        System.out.println(NumberConverter.binaryToDecimal(result));

    }


    public static int [] add ( int [] num1,int[] num2)

    {
        // Output will contain longest input number +1
        int lengthOfOutputArray=Math.max(num1.length,num2.length);

        int [] output=new int [lengthOfOutputArray+1];

        int carry=0;

        // 1+1+0   sum=2  sum=0,carry=1
        // 1+1+1   sum=3  sum=1,carry=1


        // We are iterating from 0 to n-1
        // Adding least significant digits first and storing results
        // Such that most significant bits come at n-1 and least significant bits at 0
        for( int i=0; i< num1.length; i++)
        {

          // System.out.println("Input1 "+num1[i]);
           // System.out.println("Input2 "+num2[i]);

           // System.out.println("=================");

            // If either array is smaller in size, replace the
            // Most significant bits with 0
            int a=i <num1.length? num1[i]:0;
            int b=i <num2.length? num2[i]:0;


            output[i]=(a+b+carry)%2;
            carry=(a+b+carry)/2;

           //System.out.println("Sum "+ output[i]);
           //System.out.println("carry "+ carry);

        }

        output[lengthOfOutputArray]=carry;

        return output;

    }

}
