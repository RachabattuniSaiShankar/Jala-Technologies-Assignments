class Constructor5
{

	Constructor5(int i)
    {
        System.out.println(i);
    }

    public static void main(String args[])
    {
        
        int x = 10;
        while( x > 0)
        {
        	Constructor5 a = new Constructor5(x);
                x--;
        }
    }
}