package methods;

// Importing required modules
import java.util.ArrayList;
import java.util.List;
public class Calculator {

//    Creating arraylist to store all the values will be added
    List<Double> arr = new ArrayList<Double>();

//    Defining method to add the number to the arrayList.
//    This takes a double value as input and adds it to the arraylist
    public void addNumber(double val){
        arr.add(val);
    }

//    Method to calculate the average of the numbers
    public void average(){

//        Getting total number of elements
        int numberOfElements = arr.size();

        double sum = 0;

//        Calculating sum of all numbers
        for(double e: arr){
            sum += e;
        }

//        Logic to calculate the average
        double avg = sum/numberOfElements;

//        Displaying output by rounding it off to two digits (as instructed in the assignment)
        System.out.println(Math.round(avg*100.0)/100.0);
    }
}
