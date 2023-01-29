package methods;

import java.util.ArrayList;
import java.util.List;
public class Calculator {
    List<Double> arr = new ArrayList<Double>();

    public void addNumber(double val){
        arr.add(val);
    }

    public void average(){
        int numberOfElements = arr.size();

        double sum = 0;

        for(double e: arr){
            sum += e;
        }

        double avg = sum/numberOfElements;

        System.out.println(Math.round(avg*100.0)/100.0);
    }
}
