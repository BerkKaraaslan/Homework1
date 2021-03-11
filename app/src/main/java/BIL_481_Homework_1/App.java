/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BIL_481_Homework_1;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }


    public static double[] concatenateArraysAndReturnMeanAndKthOrderStatistics (double [] array1, double [] array2, double [] array3, Integer k){

        /*
            This method concatenates and sort given arrays(array1, array2 and array3) and returns a double array whose length is 2.
            First element of the result array is mean of this array.
            Second element of the result array is k'th order statistic of this larger array.
            If an error is occur or some parameters are invalid then this method returns null.

        */


        if(array1 == null || array2 == null || array3 == null || k == null ){ // check null parameters 
            return null;
        }

        if(k > (array1.length + array2.length + array3.length) || k <=0){ // k must be >=1 and <= sum of the all arrays lengths
            return null;
        }

        double[] big_array = new double[array1.length + array2.length + array3.length];

        double mean =0;

        for(int i=0;i<array1.length;i++){
            big_array[i] = array1[i];
            mean +=array1[i];
        }
        
        for(int i=0;i<array2.length;i++){
            big_array[array1.length + i] = array2[i];
            mean +=array2[i];
        }

        for(int i=0;i<array3.length;i++){
            big_array[array1.length + array2.length + i] = array3[i];
            mean += array3[i];
        }
        
        mean = mean / (array1.length + array2.length + array3.length);

        double k_statistic = 0;

        Arrays.sort(big_array);

        k_statistic = big_array[k-1];

        double[] result_array = new double[2];

        result_array[0] = mean;
        result_array[1] = k_statistic;



        return result_array;
    }





}
