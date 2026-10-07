// Counter interface implementation
public class WordProcessor implements Counter {
    private String text = ""; // Used if user does not enter a value for sentence

    @Override
    public int countWords (String sentence){
        if (sentence.isEmpty()){
            return text.split(" ").length;
        }
        return sentence.split(" ").length;

        // splits the sentence at the spaces and then takes the length of the list
    }

    @Override
    public int countLetters (String sentence){
        int count = 0;

        // Counts the number of letters in 'text' if the user does not enter a value
        if (sentence.isEmpty()){
            for (int x = 0; x < text.length(); x++){
                if (Character.isLetter(text.charAt(x))){
                    count++;
                }
            }
            return count;
        }

        // Counts the number of letters in the sentence input by the user
        for (int i = 0; i < sentence.length(); i++){
            if (Character.isLetter(sentence.charAt(i))){
                count++;
            }
        }
        return count;
    }


    // returns the length of 'text' or input sentence
    @Override
    public int getLength(String sentence){
        if (sentence.isEmpty()){
            return text.length();
        }
        return sentence.length();
    }

    // getter for text
    public String getText(){
        return this.text;
    }

    // setter for text
    public void setText(String text){
        this.text = text;
    }

}
