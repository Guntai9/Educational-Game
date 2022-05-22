package assets.JAVA;

import java.util.Scanner;
public class Interrogation {
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
String ball;
boolean bark;
bark = false;
           
System.out.println("Were you present at Thomas' house on the night of the murder?");
System.out.println("Type yes to throw a ball spontaneously and surprise the dog");
ball = scnr.nextLine()
if (ball.equals("yes")) {
bark = true;
System.out.println("This dog is definitely suspicious!");
}
else if (ball.equals("no")) {
bark = false;
System.out.println("I guess a dog couldn't have committed this tragedy.");
}
else {
System.out.println("What am I doing, why am i interrogating a dog?");
}
}
} 

/*CORRECT ANSWER*/
/*What am I doing, why am i interrogating a dog?*/ 
