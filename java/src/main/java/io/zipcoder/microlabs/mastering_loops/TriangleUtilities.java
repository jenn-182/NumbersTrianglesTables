package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        String result = "";
        int i = 1;
        while (i <= numberOfStars) {
            result = result + '*';
            i = i + 1;
        }
        //result = result + '\n';
        return result;

    }

    public static String getTriangle(int numberOfRows) {

        String result="";
        int i=1;
        while (i<numberOfRows) {
            result=result+getRow(i) + '\n';
            i++;
        }
        return result;
    }

    // hmm
    
    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
