class CompareTo {
    public static void main(String[] args)
    {
 
        String s1 = "Sai";
        String s2 = "Sai";
        String s3 = "Shankar";
        String s4 = new String("S"); 
        
        System.out.println(s1 + " .compareTo " + s2 + ": " + s1.compareTo(s2));
 
        System.out.println(s1 + " .compareTo " + s3 + ": " + s1.compareTo(s3));
 
        System.out.println(s3 + " .compareTo " + s2 + ": " + s3.compareTo(s2));
 
        
        System.out.println(s1 + " .compareTo " + s4 + ": " + s1.compareTo(s4));
    }
}