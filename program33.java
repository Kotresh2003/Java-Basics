public class program33 {
    public static void main(String[] args)
    {
        //  for (int i=0; i<5; i++){
        //     System.out.println(i);
        //     System.out.println("java is good");
        //     if(i==3){
        //         System.out.println("ending");
        //         break;
        //     }
        //  }
        int i=0;
        while (i<5) {
            System.out.println(i);
            System.out.println("java is good");
            // i++;
            if(i==3){
                System.out.println("stop");
                break;
            }
            i++;
        }
    }
}
