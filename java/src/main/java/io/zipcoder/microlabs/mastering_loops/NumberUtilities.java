package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {

        // Initialize an empty string to hold result
        String result="";

        // Iterate through the range from start to stop with the given step
        //  step skips by 5 so it should be 5,10,15
        for (int i=start;i<stop;i=i+step){

            // use Math.pow to calculate the exponentiation of i
            //use double because expected includes decimal values
            double doubleResult=Math.pow(i,exponent);

            //convert double to string
            result= result + String.valueOf(doubleResult);
        }
        //return result
        return result; 
    }

    public static String getRange(int start, int stop, int step) {

        // Initialize an empty string to hold result
        String result="";

        // Iterate through the range from start to stop with the given step
        for (int i = start; i < stop; i += step) {
            result = result + i;
        }

    //return result    
    return result;

    }

    public static String getRange(int start, int stop) {
       
        // Initialize an empty string to hold result
        String result="";

        // Iterate through the range from start to stop (include 'start' -> set equal and exclude 'stop' ->not equal)
        for (int i=start;i<stop;i++) {
            result = result + i;
        }
    //return result    
    return result;
    }

    public static String getRange(int stop) {
       
        // Initialize an empty string to hold result
        String result="";

        // Iterate through the range from 0 to stop
        for (int i=0; i<stop;i++) {
            result = result + i;
        }

        //return result
        return result;
    }

    /*
     * natural break
     */


    public static boolean isNumberEven(int toTest) { return toTest % 2 == 0; } //test even

    public static boolean isNumberOdd(int toTest) { return toTest % 2 != 0; } //test odd

    public static String getEvenNumbers(int start, int stop) {
    
         // Initialize an empty string to hold result
        String result = ""; 

        // Iterate through the range from start to stop (include 'start' -> set equal and exclude 'stop' ->not equal)
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        //return result
        return result; 
    }
    

    public static String getOddNumbers(int start, int stop) {

        // Initialize an empty string to hold result
        String result = ""; 

        // Iterate through the range from start to stop (include 'start' -> set equal and exclude 'stop' ->not equal)
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                result = result + i;
            }
        }
        //return result
        return result; 
    }
    

    public static String getSquareNumbers(int start, int stop, int step) {
        // Initialize an empty string to hold result
        String result = "";

        // Iterate through the range from start to stop with the given step
        //  step skips by 5 so it should be 5,10,15
        for (int i = start; i < stop; i += step) {
            result = result + (i * i);
        }
        //return result
        return result;
    }

}
