package arrays_and_strings.assigment_problems;
public class WordLengthProfiler {
    static void classifyWordLengths(String review) {
        int shortWords = 0, mediumWords = 0, longWords = 0;
        for (String word : review.trim().split("\\s+")) {
            int n = word.length();
            if (n >= 1 && n <= 4) shortWords++;
            else if (n <= 8) mediumWords++;
            else longWords++;
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }
    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}