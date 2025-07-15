package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        // Initialize an empty string to hold the row of stars
        String result = "";

        // Use a while loop until the number of stars is reached
        int i = 1;
        while (i <= numberOfStars) {
            result = result + '*';
            i = i + 1;
        }
        //result = result + '\n';
        return result;

    }

    public static String getTriangle(int numberOfRows) {

        // Initialize an empty string to hold the triangle
        String result="";

        // Use a while loop to build the triangle row by row
        int i=1;
        while (i<numberOfRows) {
            result=result+getRow(i);
            // Add a newline character after each row
            result = result + '\n';
            i++;
        }
        // Add the last row
        return result;
    }

    
    public static String getSmallTriangle() {
       
        //Set to 4 because in previous function we had to add an extra row
        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        //Set to 10 because in previous function we had to add an extra row
        return getTriangle(10);
    }
}
