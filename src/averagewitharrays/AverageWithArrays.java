/* The program prompts the user for five to ten numbers all on one line, 
separated by spaces, calculates the average of those numbers, and displays the 
numbers and their average to the user.

The program uses methods to:

1. Get the numbers entered by the user
2. Calculate the average of the numbers entered by the user
3. Print the results

The first method should take no arguments and return an array of doubles 
that the user entered.

The second method should take an array of doubles (the return value of the 
first method above) as its only argument and return a double (the average).

The third method should take an array of doubles and a (single) double value
as arguments but have no return value.

For example:

If the user input is:

40 60 20 80 100

Then the program should give as output:

The average of the numbers 40.00, 60.00, 20.00, 80.00, and 100.00 is 60.00.

 */
package averagewitharrays;

import java.util.Scanner;

public class AverageWithArrays {

    public static void main(String args[]) {
        double[] result = inputDouble();
        
        if (result.length < 5 || result.length > 10) {
            System.out.println("Numbers entered are not within range");
        } else {
            double avg = Average(result);
            printResults(result, avg);
        }

    }

    public static double[] inputDouble() {
        String data;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of 5 to 10 numbers separated by spaces: ");
        data = in.nextLine();
        String delims = "[ ]+";
        String[] sData = data.split(delims);
        
        double[] nums = new double[sData.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Double.parseDouble(sData[i]);
        }
        return nums;
    }

    public static double Average(double[] data) {
        double sum = 0;
        
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }

    public static void printResults(double[] data, double average) {
        double sum = 0;
        String separator = "";
        System.out.print("The average of the numbers ");
        for (double d : data) {
            System.out.print(separator + d);
            separator = ", ";
        }
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println(" is " + average + ".");
    }
}