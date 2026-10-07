public class WordProcessor implements Counter {
    @Override
    public int countWords (String sentence){
        String[] words = sentence.split(" ");
        return words.length;
    }

    @Override
    public int countLetters (String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (Character.isLetter(sentence.charAt(i))){
                count++;
            }
        }
        return count;
    }

    @Override
    public int getLength(String sentence){
        return sentence.length();
    }
}
