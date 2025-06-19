public class program17 {
    public static void main(String[] args)
    {
       String name = "Kotresh";
       System.out.println(name);

       int value = name.length();
       System.out.println(value);

       String lstring = name.toLowerCase();
       System.out.println(lstring);

       String ustring = name.toUpperCase();
       System.out.println(ustring);

       String nonTrimmedString = "  Kotresh  ";
       System.out.println(nonTrimmedString);
       
       String trimmedString = nonTrimmedString.trim();
       System.out.println(trimmedString);

       System.out.println(name.substring(0));
       System.out.println(name.substring(0,5));
       System.out.println(name.replace('r','d'));
       System.out.println(name.startsWith("Ko"));
       System.out.println(name.endsWith("sh"));
       System.out.println(name.charAt(2));
       String modifiedname = "kotreshhhh";
       System.out.println(modifiedname.indexOf("h"));
       System.out.println(modifiedname.lastIndexOf("o"));
       System.out.println(name.equals("Kotresh"));
       System.out.println(name.equalsIgnoreCase("kotresH"));
     }
}
