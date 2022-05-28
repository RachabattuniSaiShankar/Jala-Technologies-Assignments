class EqualsIgnoreCase {
    public static void main(String[] args)
    {
 
        // Get some Strings to compare
        String s1 = "Sai";
        String s2 = "Sai";
        String s3 = "Shankar";
        String s4 = new String("S");
 
        System.out.println(s1 + " .equalsIgnoreCase " + s2 + ": " + s1.equalsIgnoreCase(s2));
 
       
        System.out.println(s1 + " .equalsIgnoreCase " + s3 + ": " + s1.equalsIgnoreCase(s3));
 
        
        System.out.println(s2 + " .equalsIgnoreCase " + s3 + ": " + s2.equalsIgnoreCase(s3));
 
        
        System.out.println(s1 + " .equalsIgnoreCase " + s4 + ": " + s1.equalsIgnoreCase(s4));
    }
}
 