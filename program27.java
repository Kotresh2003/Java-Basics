import java.util.Scanner;
public class program27 {
    public static void main(String[] args)
    {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in pysics");
        m1=sc.nextInt();

        System.out.println("enter your marks in chemistry");
        m2=sc.nextInt();

        System.out.println("enter your marks in biology");
        m3=sc.nextInt();
        double avg =(m1+m2+m3)/3;
        System.out.println("your overall percentage is: " +avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you are promoted");
        }
        else{
            System.out.println("you are not promoted");
        }
    }
}
