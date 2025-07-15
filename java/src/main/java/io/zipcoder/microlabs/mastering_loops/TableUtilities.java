package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getMultiplicationTable(int tableSize) {

       //Create variable table to hold empty string
       String table = "";

       //Create outer loop for ROWS -> R => the amound of rows needed
       // Iterate from 1 to tableSize (including tableSize)
       for (int r = 1; r <= tableSize; r++) {

           // Create inner loop for COLUMNS -> C => the amount of columns needed
           for (int c = 1; c <= tableSize; c++) {

               // Multiply the row and columns to get the total for the table 
               //(how many times the row and column intersect)
               int valueOfTableSize = r * c;

               //If number is less than 10, add 2 spaces before the number 
               //and a | to the end
               if (valueOfTableSize < 10) {
                   table = table + "  " + valueOfTableSize + " |";
                } else if (valueOfTableSize < 100) {
                    //If number is less than 100, add one space before the number
                    //add a | to the end
                    table = table + " " + valueOfTableSize + " |";
                } else {
                    //If number is greater than 100, no need to add spaces
                    //add a | to the end
                     table = table + valueOfTableSize + " |";
                }
           }
            // Add a newline at the end of each row
            table = table + "\n";
       }
       //Return the table
       return table;
    }


    public static String getSmallMultiplicationTable() {

        //call the getMultiplicationTable method with 5 to get 5 rows and 5 columns
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        //call the getMultiplicationTable method with 10 to get 10 rows and 10 columns
        return getMultiplicationTable(10);
    }
}
