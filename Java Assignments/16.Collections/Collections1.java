import java.util.ArrayList;
public class Collections1
{
	public static void main(String[] args) {
ArrayList Cricketers= new ArrayList();
Cricketers.add("MS Dhoni");
Cricketers.add("Virat Kohli");
Cricketers.add("Rohith Sharma");
Cricketers.add("Kane Willamson");
Cricketers.add("Jos Buttler");
System.out.println(Cricketers);
Cricketers.add(4,"David Warner"); //Adding at Specific Index
System.out.println("After Adding at Specific Index :" +Cricketers);
Cricketers.remove(2); //Removing at Specific Index
System.out.println("Cricketers Before Updating : " + Cricketers);
Cricketers.set(3,"Ross Taylor"); //Updating at Specific Index
System.out.println("Cricketers After Updating : " + Cricketers);
System.out.println("Indexof The element is : " + Cricketers.indexOf("Virat Kohli")); //indexOf element
System.out.println("Element at Particular Index is : " + Cricketers.get(0)); //Element at Particular Index
System.out.println("Size of the Cricketers ArrayList : " + Cricketers.size());
System.out.println("Particular Name Of Cricketers : " +Cricketers.contains("Rohith Sharma")); //Given element in the arraylist

System.out.println("Cricketers Before Removing From The Arraylist : " + Cricketers);
Cricketers.removeAll(Cricketers); //removing all the elements form the Arraylist 
System.out.println("Cricketers After Removing From The Arraylist : " +  Cricketers);



	}
}
