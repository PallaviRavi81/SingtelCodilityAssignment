package main.com.java.sg.singtel.codility;

import main.com.java.sg.singtel.codility.impl.Bird;
import main.com.java.sg.singtel.codility.impl.Chicken;
import main.com.java.sg.singtel.codility.impl.Duck;
import main.com.java.sg.singtel.codility.impl.Rooster;
import main.com.java.sg.singtel.codility.impl.RoosterDelegation;

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
 		
 		
 		

	}

}
