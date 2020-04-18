package main.com.java.sg.singtel.codility;

import main.com.java.sg.singtel.codility.impl.Bird;
import main.com.java.sg.singtel.codility.impl.Butterfly;
import main.com.java.sg.singtel.codility.impl.Cat;
import main.com.java.sg.singtel.codility.impl.Chicken;
import main.com.java.sg.singtel.codility.impl.Clownfish;
import main.com.java.sg.singtel.codility.impl.Dog;
import main.com.java.sg.singtel.codility.impl.Dolphin;
import main.com.java.sg.singtel.codility.impl.Duck;
import main.com.java.sg.singtel.codility.impl.Parrot;
import main.com.java.sg.singtel.codility.impl.Rooster;
import main.com.java.sg.singtel.codility.impl.RoosterDelegation;
import main.com.java.sg.singtel.codility.impl.Shark;

public class Solution {
	public static void main(String[] args) {
		// Question 1
		System.out.println("---------------- BIRD ----------------");
		Animal bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		// Question 2
		System.out.println("----------------CHICKEN----------------");
		Animal myChicken =  new Chicken(); 
 		myChicken.walk(); 
 		myChicken.fly(); 
 		myChicken.sing(); 
 		 
 		System.out.println("----------------DUCK----------------"); 
		Animal myDuck =  new Duck(); 
 		myDuck.walk(); 
 		myDuck.fly(); 
 		myDuck.sing();
 		
 	  // Question 3
 		System.out.println("----------------ROOSTER----------------"); 
 		Animal myRooster =  new Rooster(); 
 		myRooster.walk(); 
 		myRooster.fly(); 
 		myRooster.sing(); 
 		
 		System.out.println("----------------ROOSTER DELEGATION ----------------"); 
 		RoosterDelegation myRoosterDel =  new RoosterDelegation(); 
 		myRoosterDel.walk(); 
 		myRoosterDel.fly(); 
 		myRoosterDel.sing(); 
 		
 	// Question 4
 		
 		System.out.println("----------------PARROT LIVING WITH DOGS----------------"); 
 		Parrot myParrotwithDogs =  new Parrot(); 
 		myParrotwithDogs.livingWith(new Dog()); 
 		myParrotwithDogs.walk(); 
 		myParrotwithDogs.fly(); 
 		myParrotwithDogs.sing();
 		
 		System.out.println("----------------PARROT LIVING WITH CATS----------------"); 
 		
 		Parrot myParrotwithCats =  new Parrot(); 
 		myParrotwithCats.livingWith(new Cat()); 
 		myParrotwithCats.walk(); 
 		myParrotwithCats.fly(); 
 		myParrotwithCats.sing(); 
 		
 		System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------"); 
 		
 		Parrot myParrotWithRoosters =  new Parrot(); 
 		myParrotWithRoosters.livingWith(new Rooster()); 
 		myParrotWithRoosters.walk(); 
 		myParrotWithRoosters.fly(); 
 		myParrotWithRoosters.sing(); 
 		
 	    System.out.println("----------------PARROT LIVING WITH DUCKS----------------"); 
 	
 	    Parrot myParrotWithDucks =  new Parrot(); 
 		myParrotWithDucks.livingWith(new Duck()); 
 		myParrotWithDucks.walk(); 
 		myParrotWithDucks.fly(); 
 		myParrotWithDucks.sing(); 
 		
 		//Model fish as well as other swimming animals 
 		 System.out.println("----------------SHARK----------------"); 
 	 	   Shark mySFish = new Shark(); 
 	 	   mySFish.fly(); 
 	 	   mySFish.sing(); 
 	 	   mySFish.walk(); 
 	 	   mySFish.swim(); 
 	 	   mySFish.colour(); 
 	 	   mySFish.eat(); 
 	 	   mySFish.makeJokes(); 
 	 	   System.out.println("----------------CLOWNFISH----------------"); 
 	 	   Clownfish myCFish = new Clownfish(); 
 	 	   myCFish.fly(); 
 	 	   myCFish.sing(); 
 	 	   myCFish.walk(); 
 	 	   myCFish.swim(); 
 	 	   myCFish.colour(); 
 	 	   myCFish.eat(); 
 	 	   myCFish.makeJokes(); 
 	 	   System.out.println("----------------DOLPHIN----------------"); 
 	 	   Dolphin dolphin = new Dolphin(); 
 	 	   dolphin.hasFishBehaviour(new Shark()); 
 	 	   dolphin.fly(); 
 	 	   dolphin.sing(); 
 	 	   dolphin.swim(); 
 	 	   dolphin.walk(); 
 	 	   
 	 	   //D.	Model animals that change their behaviour over time 
 	 	   System.out.println("----------------BUTTERFLY----------------"); 
 	 	   Butterfly myButterFly =  new Butterfly(); 
 	 	   myButterFly.setCaterpiller(false); 
 	 	   myButterFly.fly(); 
 	 	   myButterFly.sing(); 
 	 	   myButterFly.walk(); 
 	 	   System.out.println("----------------CATERPILLAR----------------"); 
 	 	   Butterfly myCaterpillar =  new Butterfly(); 
 	 	   myCaterpillar.setCaterpiller(true); 
 	 	   myCaterpillar.fly(); 
 	 	   myCaterpillar.sing(); 
 	 	   myCaterpillar.walk(); 

	}

}
