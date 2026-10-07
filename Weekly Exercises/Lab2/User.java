import java.util.Scanner;

public class User {
    public static void main(String[] args){
        WordProcessor processor = new WordProcessor();
        System.out.println("Enter a sentence to be processed: ");

        // User input for sentence
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();


        //Testing each interface method
        System.out.println("Number of words: " + processor.countWords(sentence));
        System.out.println("Number of letters: " + processor.countLetters(sentence));
        System.out.println("Total length: " + processor.getLength(sentence));
        System.out.println();

        // This will be used as the default text when nothing is input
        processor.setText("This is the text used if the user does not input a sentence");
        System.out.println(processor.getText());

        // Enter nothing to test an empty input
        sentence = scanner.nextLine();
        System.out.println("Number of words: " + processor.countWords(sentence));
        System.out.println("Number of letters: " + processor.countLetters(sentence));
        System.out.println("Total length: " + processor.getLength(sentence));
    }
}
