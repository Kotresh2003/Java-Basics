public class elseif {
    public static void main(String[] args)
    {
        int n=6;
        if(n%2==0){
            System.out.println("two");
        }
        else if(n%3==0){
            System.out.println("three");
        }
        else if(n%11==0){
            System.out.println("eleven");
        }
        else{
            System.out.println(-1);
        }
    }
}
