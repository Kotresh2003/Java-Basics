import java.util.Scanner;
public class program25 {
    
    public static void main(String[] args)
    {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
            System.out.println("you are adult");
           break;
    
            case 25:
            System.out.println("you are yet to married");
            break;

            case 60:
            System.out.println("you are old");
           break;
            
            default:
            System.out.println("enjoy your life");

        }
//         if (age>56){
//             System.out.println("yor are experienced");
//         }
//         // int age = 31;
//         if(age>50){
//             System.out.println("you are experienced");
//         }
//         else if(age>40){
//             System.out.println("yor are semi exoerinced");
//         }
//         else if(age>30){
//             System.out.println("you are semi semi experinced");
//         }
//         else{
//             System.out.println("you are not experienced");
//         }
     }
 }
