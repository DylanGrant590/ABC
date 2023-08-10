import java.util.Scanner;
import java.util.Random;
public class ABC {

	public static void main(String[] args) {

		//Loops menu
		ABC menu = new ABC();
	    menu.display();
	}
	
//Variables
int score = 0;

//System objects.
Scanner scanner = new Scanner(System.in);
Random rand = new Random();

//Sorts through an array of the alphabet. 
String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", 
		"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

//Prints a welcome statement to the user.
public void display() {
System.out.println("##############################");
System.out.println("#Welcome to ABC Fast or Slow!#");
System.out.println("##############################");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}

//Questions
System.out.println("\nABC Fast or Slow?");
String answer = scanner.nextLine().trim().toLowerCase();
if(answer.equals("fast") || answer.equals("slow")) {
	String letter = letters[rand.nextInt(letters.length)];
	System.out.println("\n" + letter + " has been stopped on.");
	score = 0;
}else {
	System.out.println("\nInvalid Option!");
	System.out.println("\nPlease enter FAST or SLOW!");
	System.out.println("");
	display();
}
System.out.println("\nPlease enter a name beginning with that letter: ");
String name = scanner.nextLine().trim().toLowerCase();
System.out.println("\nYou entered " + name + ".");
score += 1;
	
System.out.println("\nPlease enter a name of an animal beginning with that letter: ");
String animal = scanner.nextLine().trim().toLowerCase();	
System.out.println("\nYou entered " + animal + ".");
score += 1;

System.out.println("\nPlease enter the name of a place beginning with that letter: ");
String place = scanner.nextLine().trim().toLowerCase();	
System.out.println("\nYou entered " + place + ".");
score += 1;

System.out.println("\nPlease enter the name of a plant beginning with that letter: ");
String plant = scanner.nextLine().trim().toLowerCase();	
System.out.println("\nYou entered " + plant + ".");
score += 1;

System.out.println("\nPlease enter the name of a thing beginning with that letter: ");
String thing = scanner.nextLine().trim().toLowerCase();	
System.out.println("\nYou entered " + thing + ".");
score += 1;
scanner.close();

//Calculations
System.out.println("\nYou got " + score + " points!");
if(score == 0) {
System.out.println("\nYou Lost!");
}else {
System.out.println("\nYou Won!");
		}
	}
}
