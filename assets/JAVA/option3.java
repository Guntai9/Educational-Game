package assets.JAVA;

public class Interrogation{
    public static void main(String[] args) {
    char letter;
    String word;
    int answer;
    Scanner scnr = new Scanner(System.in);
                  
    System.out.println("How many p's are in the word Hippopotamus?");
    word = "hippopotamus";
    letter = 'p';
                  
    int wordCount = 0;
                  
    for (int i = 0; i < word.length(); ++i) {
    if (word.charAt(i) == letter) {
    wordCount++;
    }}
    if (wordCount < 2 && wordCount > 0) {
    System.out.println(wordCount + " " + letter);
    }
    else {
    System.out.println(wordCount + " " + letter + "'s");
    }
    answer = scnr.nextInt();
    if (answer == 3) {
    System.out.println("Maybe he's not the murderer");
    }
    else if (answer != 3) {
    System.out.println("HMMM, Suspicious!");
    }
    }
    }