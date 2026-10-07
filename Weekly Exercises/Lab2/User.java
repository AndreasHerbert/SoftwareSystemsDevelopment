import java.util.Scanner;

public class User {
    public static void main(String[] args){
        WordProcessor processor = new WordProcessor();
        System.out.println("Enter a sentence to be processed: ");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println("Number of words: " + processor.countWords(sentence));
        System.out.println("Number of letters: " + processor.countLetters(sentence));
        System.out.println("Total length: " + processor.getLength(sentence));
    }
}
