/*Kevin Meza | CSD320 | December 10, 2023 | Module 10 Assignment */
package overloading;
import java.util.Arrays;

public class Overloading {

    /* defines the Method Average for short Array */
    public static short average(short [] array)
    {
        /* declaring Variables */
        short value = 0, count = 0;
        /* using For each Loop to calculate the variable value and count */
        for(short i : array){
           value = (short) (value + i); 
           count++;
        }
        value = (short) (value / count);
        return value;
    }

    /* this defines the method Average for integer array */
    public static int average(int [] array)
    {
        /* declaring the variables that are used */        
        int value = 0, count = 0;
        /* using each loop to calculate the variable value and count */
        for(int i : array){
           value = (int) (value + i); 
           count++;
        }
        value = (int) (value / count);
        return value;
    }
    
    /* defines the method Average for long Array */
    public static long average(long [] array)
    {
        /* declares the variables used */        
        long value = 0, count = 0;
        /* using each loop to calculate the variable value and count */
        for(long i : array){
           value = (long) (value + i); 
           count++;
        }
        value = (long) (value / count);
        return value;
    }
    
    /* defines the method Average for double array */
    public static double average(double [] array)
    {
        /* declares the variables used */        
        double value = 0, count = 0;
        /* using each loop to calculate the variable value and count */
        for(double i : array){
           value = (double) (value + i); 
           count++;
        }
        value = (double) (value / count);
        return value; 
    }
    
    public static void main(String[] args) 
    {
        /* declares the sample Arrays */
        /* sample integer Array */
        int[] Arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        /*  sample short Array */
        short[] Arrshort = new short[]{ 35, 25, 18, 45, 77, 21, 3 };
        /*  sample long Array */
        long[] Arrlong = new long[]{ 1000, 2000, 3000, 4000, 5000, 6000, 7000 };
        /*  sample double Array */        
        double[] Arrdouble = new double[]{10.1, 20.2, 30.3, 40.4, 50.5, 60.6 };
        
       /* stores the average value returned by the functions */ 
       int resultint =  average(Arr);
       short resultshort =  average(Arrshort);
      long resultlong =   average(Arrlong);
       double resultdouble =  average(Arrdouble);
       
       /* prints the array and average */
       System.out.print("Array of Integers is : ");       
       System.out.println(Arrays.toString(Arr));
       System.out.println("Average = " + resultint);
       
       /* prints the array and average */
       System.out.print("\nArray of Short is : ");       
       System.out.println(Arrays.toString(Arrshort));
       System.out.println("Average = " + resultshort);       

       /* prints the array and average */       
       System.out.print("\nArray of Long is : ");       
       System.out.println(Arrays.toString(Arrlong));
       System.out.println("Average = " + resultlong);

       /* prints the array and average */       
       System.out.print("\nArray of Double is : ");       
       System.out.println(Arrays.toString(Arrdouble));
       System.out.println("Average = " + resultdouble);       
    }
    
    
    
}
