package assets.JAVA;

public class Interrogation {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int[] iqTest = new int[10]; 
    int i;
    int mid;
    mid = 0;
    System.out.println("Give us a list of numbers between 0-9, Oliver");
    for (i = 0; i < iqTest.length; ++i) {
                     
    iqTest[i] = scnr.nextInt();
    if (iqTest[i] < 0) {
    mid = (0+i-1)/2;
    System.out.println("Tell us what the middle number is.");
    System.out.println(iqTest[mid]);
    break;
    }
                    
    }
    System.out.println("This kid is smarter than I thought, he could've committed this heinous crime!");
    }
    }

    /*CORRECT ANSWER*/ 
    /*No value found*/ 
