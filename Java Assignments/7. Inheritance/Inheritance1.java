class  Box {
   private  double width;
   private  double height;
   private  double depth;

   Box(double w,  double h,  double d)
   {
       width = w;
       height = h;
       depth = d;
   }

   double  volume() {
       return width * height * depth;
   }
}

class  BoxWeight  extends  Box
{
   double weight; 
   BoxWeight(double w,  double h,  double d,  double m) {
       super(w, h, d);  
       weight = m;
   }
}


class  CardboardBox  extends  BoxWeight {
   double cost;

   CardboardBox(double w,  double h,  double d,  double m,  double c) {
       super(w, h, d, m);  
       cost = c;
   }
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		CardboardBox cdb1 =  new CardboardBox(1,  2,  3,  5,  3.41);
		CardboardBox cdb2 =  new CardboardBox(2,  4,  6,  10,  1.28);

	       double vol;
	       vol = cdb1.volume();

	       System.out.println("The volume of cdb1 is " + vol);
	       System.out.println("The weight of cdb1 is " + cdb1.weight);
	       System.out.println("Shipping cost: Rs." + cdb1.cost);
	       System.out.println();

	       vol = cdb2.volume();
	       System.out.println("The volume of cdb2 is " + vol);
	       System.out.println("The weight of cdb2 is " + cdb2.weight);
	       System.out.println("Shipping cost: Rs." + cdb2.cost);
	}

}
