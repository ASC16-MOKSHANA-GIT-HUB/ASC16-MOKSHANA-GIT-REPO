package Lab1;

public class WordCount {
    static int countWordsOnly(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] tokens = str.trim().split("\\s+");
        int count = 0;

        for (String token : tokens) {
            if (token.matches("[a-zA-Z]+")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "Sum of 12 and 20 is 32";
        int wordCount = countWordsOnly(sentence);
        System.out.println("Number of words: " + wordCount);
    }
}