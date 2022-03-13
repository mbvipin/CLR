package main.java.com.vipin.strassen;

import main.java.com.vipin.model.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMultiplication {


    public static void main(String [] args) throws Exception {
        int [] row1=new int [] {2,2,2,2};
        int [] row2=new int [] {3,3,3,3};
        int [] row3=new int [] {2,2,2,2};
        int [] row4=new int [] {3,3,3,3};

        List<int []> listOfRows=new ArrayList<>();

        listOfRows.add(row1);
        listOfRows.add(row2);
        listOfRows.add(row3);
        listOfRows.add(row4);


        Matrix m1=new Matrix(listOfRows);

        Matrix m2=new Matrix(listOfRows);

        Matrix m3= multiplyMatrices(m1,m2);

        Matrix m4=multiplyMatricesUsingDivide(m1,m2,4,0,0,0,0);

        print(m3);
        print(m4);

    }

    private static void print(Matrix m3) {

        m3.getRows().stream().forEach(
                array-> {

                    System.out.println(Arrays.toString(array));
                }
        );
    }





    private static Matrix multiplyMatricesUsingDivide(Matrix m1, Matrix m2,int size,int firstRowStart,int firstColStart,int secondRowStart,int secondColStart) throws Exception {
        List<int[]> listOfRowsInResult = new ArrayList<>();

        if(size==1)
        {

        }

        if(size==2)
        {
                // When size/2 is 2, this method should be able to extract a 2/2 matrix from original matrix
                // and multiply

            return multiplyMatrices(m1,m2,size,firstRowStart,firstColStart,secondRowStart);
        }

        else
        {

           Matrix p0000= multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart,firstColStart,secondRowStart,secondColStart);

            Matrix p0110=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart,firstColStart+(size/2),secondRowStart+(size/2),secondColStart);

            Matrix p0001=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart,firstColStart,secondRowStart,secondColStart+(size/2));

            Matrix p0111=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart,firstColStart+(size/2),secondRowStart+(size/2),secondColStart+(size/2));

            Matrix p1000=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart+(size/2),firstColStart,secondRowStart,secondColStart);

            Matrix p1110=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart+(size/2),firstColStart+(size/2),secondRowStart+(size/2),secondColStart);

            Matrix p1001=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart+(size/2),firstColStart,secondRowStart,secondColStart+(size/2));

            Matrix p1111=multiplyMatricesUsingDivide(m1,m2,size/2,firstRowStart+(size/2),firstColStart+(size/2),secondRowStart+(size/2),secondColStart+(size/2));

            Matrix m00=add(p0000,p0110);
            Matrix m01=add(p0001,p0111);
            Matrix m10=add(p1000,p1110);
            Matrix m11=add(p1001,p1111);

            int [] row00= m00.getRows().get(0);
            int [] row01= m01.getRows().get(0);

            


            // Creating 4 n/2 matrices from a matrix with n/n
            // Min row-- 0 Max Row - size/2  Min Column-- 0 Max Column= size/2
            // Min row-- 0 Max Row - size/2  Min Column-- size/2+1 Max Column= size-1
            // Min Row -- size/2+1 Max Row size-1 Min Column-- 0 Max Column= size/2
            // Min Row -- size/2+1 Max Row size-1 Min Column-- size/2+1 Max Column= size-1
        }



        return new Matrix(listOfRowsInResult);


    }

    private static Matrix add(Matrix p1, Matrix p2) {

        List<int []> listOfRowsInResult=new ArrayList<>();

        for(int i=0; i< p1.getRows().size(); i++)
        {
           int [] row=new int [p1.getRows().size()];

            for(int j=0; j< p1.getRows().get(i).length; j++)
            {
                row[j]=p1.getRows().get(i)[j]+p2.getRows().get(i)[j];
            }

            listOfRowsInResult.add(row);

        }

        return new Matrix(listOfRowsInResult);

    }


    private static Matrix multiplyMatrices(Matrix m1, Matrix m2) throws Exception {

            List<int[]> listOfRowsInResult = new ArrayList<>();

            int rowSizeOfFirstMatrix = m1.getRows().size();
            int columnSizeOfFirstMatrix = m1.getRows().get(0).length;
            int rowSizeOfSecondMatrix = m2.getRows().size();
            int columnSizeOfSecondMatrix = m2.getRows().get(0).length;

            if(columnSizeOfFirstMatrix != rowSizeOfSecondMatrix)
            {
                throw new Exception("Invalid inputs");
            }

              // for each row in matrix 1
            for (int i = 0; i < rowSizeOfFirstMatrix; i++) {
                // for each column in matrix 2

                int [] result=new int [rowSizeOfFirstMatrix];
                  for(int j=0; j< columnSizeOfSecondMatrix; j++)
                  {
                      int sum=0;
                      for (int k=0; k < rowSizeOfSecondMatrix; k++)
                      {
                          int firstMultiplicant=m1.getRows().get(i)[k];
                          int secondMultiplicant=m2.getRows().get(k)[j];

                          sum+=firstMultiplicant * secondMultiplicant;



                      }
                      result[j]=sum;
                  }


                listOfRowsInResult.add(result);

                        // find the value for each row


            }
            return new Matrix(listOfRowsInResult);
        }


    private static Matrix multiplyMatrices(Matrix m1, Matrix m2,int size,int rowStartFirst,int colStartFirst,int rowStartSecond) throws Exception {

        List<int[]> listOfRowsInResult = new ArrayList<>();


        // for each row in matrix 1
        for (int i = rowStartFirst; i < rowStartFirst+size; i++) {
            // for each column in matrix 2

            int [] result=new int [size];
            int colIndexInResult=0;
            for(int j=colStartFirst; j< colStartFirst+size; j++)
            {

                int sum=0;
                for (int k=rowStartSecond; k < rowStartSecond+size; k++)
                {
                    int firstMultiplicant=m1.getRows().get(i)[k];
                    int secondMultiplicant=m2.getRows().get(k)[j];

                    sum+=firstMultiplicant * secondMultiplicant;



                }
                result[colIndexInResult++]=sum;
            }


            listOfRowsInResult.add(result);

            // find the value for each row


        }
        return new Matrix(listOfRowsInResult);
    }

}
