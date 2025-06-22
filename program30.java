import java.util.Scanner;
public class program30 {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    String website = sc.next();
    if(website.endsWith(".org")){
        System.out.println("this is an organization website");
    }
    else if(website.endsWith(".com")){
        System.out.println("this is an commerical website");
    }
    else if(website.endsWith(".in")){
        System.out.println("this is an indian website");
    }
    else
    {
        System.out.println("no website are their");
    }
   } 
}
