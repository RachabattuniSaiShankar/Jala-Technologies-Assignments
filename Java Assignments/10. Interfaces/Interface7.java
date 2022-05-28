interface AnimalEat {
   void eat();
}
interface AnimalTravel {
   void travel();
}
public class Interface7 implements AnimalEat, AnimalTravel {
	public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	
	public static void main(String[] args) {
		Interface7 i = new Interface7();
	      i.eat();
	      i.travel();
	}

}
