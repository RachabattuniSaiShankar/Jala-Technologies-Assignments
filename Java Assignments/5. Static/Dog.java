public class Dog { 
    private String breed; 
    private String name; 
 
    public String getBreed() { 
        return breed; 
    } 
 
    public void setBreed(String breed) { 
        this.breed = breed; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    public static String getBreed (Dog dadDog, Dog momDog) { 
		
		if (dadDog.getBreed().equals(momDog.getBreed())) { 
            return dadDog.getBreed(); 
        } else { 
            return dadDog.getBreed()+"-cross-"+momDog.getBreed(); 
        } 
    } 
     
    public static Dog createPup(String name, String breed) { 
 
		
        Dog pup = new Dog(); 
 
		pup.setBreed(breed); 
        pup.setName(name); 
 
        return pup; 
    } 
} 