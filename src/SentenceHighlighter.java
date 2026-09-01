import java.util.Scanner;
    public class SentenceHighlighter {

        //Gracen Brown, September 1st, SentenceHighlighter Assignment

        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter a word to find within the sentence: ");
        String word = scanner.next();

        int startIndex = sentence.indexOf(word);
        int wordLength = word.length();
        int endIndex = startIndex + wordLength;

        String before = sentence.substring(0, startIndex);
        String middle = sentence.substring(startIndex, endIndex);
        String after = sentence.substring(endIndex);
        
        System.out.println("Original: " + sentence);
        System.out.println("Highlighted: " + before + "*" + middle + "*" + after);

        System.out.println("Word (lowercase): " + word.toLowerCase());
        System.out.println("Sentence length: " + sentence.length());
    }
}
