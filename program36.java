public class program36 {
    public static void main(String[] args)
    {
int [] marks = {99, 87, 78, 62, 55};
// double [] marks = {99.1, 89.5, 79.9, 67.4, 56.5};
// System.out.println(marks.length);
// System.out.println(marks[2]);
// String [] name = {"kotresh", "sudeeep", "akshay", "sai"};
// System.out.println(name.length);
// System.out.println(name[2]);
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);
System.out.println(marks[4]);

// display the array (for loop)
System.out.println("printing using for loop");
for(int i=0; i<marks.length; i++){
    System.out.println(marks[i]);
}
// displaying the array (for loop)
System.out.println("printing using for loop in reverse order");
for(int i=marks.length -1; i>=0; i--){
    System.out.println(marks[i]);
}

System.out.println("printing using for-each loop");
for(int element: marks){
    System.out.println(element);
}
    }
}
