public class program24 {
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        // if (a && b)
        if(a || b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && false);

        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || false);
    }
}
