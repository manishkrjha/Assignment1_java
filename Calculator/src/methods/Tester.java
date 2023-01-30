package methods;
import java.util.Scanner;

//Defining Tester class to test the program
public class Tester {
    public static void main(String[] args){

//        Creating scanner object to take the input
        Scanner sc = new Scanner(System.in);

//        Taking the value of total number of elements to be inserted
        System.out.println("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();

        Calculator c = new Calculator();

        for(int i=1;i<=numberOfElements;i++){

//            Inputting each number
            System.out.println("Enter the number: ");
            double num = sc.nextDouble();

//            Inserting the elements
            c.addNumber(num);
        }

//        Calculating and displaying the average
        c.average();
    }

}
