class Method5
{
   public double myMethod(int num1, int num2)
   {
      System.out.println("First myMethod of class Demo");
      return num1+num2;
   }
   public int myMethod1(int num1, int num2)
   {
      System.out.println("Second myMethod of class Demo");
      return num1-num2;
   }

   public static void main(String args[])
   {
	   Fourth  mthd= new Fourth();
	   mthd.myMethod(10,10);
	   mthd.myMethod1(20,12);
   }
}