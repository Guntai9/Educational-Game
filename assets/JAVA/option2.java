package assets.JAVA;

public class Interrogation {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int leftHand;
    int rightHand;
    int totalFingers;
                
    System.out.println("Enter the number of fingers on your left hand");
    leftHand = scnr.nextInt();
    System.out.println("Enter the number of fingers on your right hand");
    rightHand = scnr.nextInt();
    totalFingers = (leftHand + rightHand);
            
    if(totalFingers != 10) {
    System.out.println("Add this person to our suspect list for further interrogation.");
    }
    if(totalFingers == 10) {
    System.out.println("Keep an eye on this person, but they are not likely to be a suspect.");
    }
            
    }
    }
/*CORRECT ANSWER*/
/*9*/ 