package methods;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();

        Calculator c = new Calculator();

        for(int i=1;i<=numberOfElements;i++){
            System.out.println("Enter the number: ");
            double num = sc.nextDouble();

            c.addNumber(num);
        }

        c.average();
    }

}
