public class blood {
    public static void main(String[] args)
    {
        int age=50;
        double weight=75.5;

        if (age>=18)
        {
          if (weight>=50)
        {
            System.out.println("your eligible to donate the blood.");
        }
        else
        {
           System.out.println("your weight is below 50 to donate blood.");
        }    
        }

        else
        {
           System.out.println("your age is above the 18."); 
        }
       
    }
}