import java.util.Scanner;
public class program28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        double tax = 0;
        double income = sc.nextDouble();
        // double income =2.5;
        if(income<2.5){
            tax = tax + 0;
        }
        else if(income>2.5 && income< 5f){
            tax = tax + 0.05 * (income - 2.5);   
        }
        else if(income>5 && income<=10.0){
            tax = tax + 0.05 * (5.0 - 2.5);
            tax = tax + 0.2 * (income - 5);
        }
        else if(income>10.0){
             tax = tax + 0.05 * (5.0 - 2.5);
             tax = tax + 0.2 * (10.0 - 5);
             tax = tax + 0.3 * (income - 10.0);
        }
        System.out.println("the total tax paid employee is: " +tax);
    }
}
