package strings.assigment_problems;
import java.util.*;
public class FilteredWordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        String clean = feedback.toLowerCase().replaceAll("[.,!?;:]", "");
        String[] words = clean.trim().split("\\s+");
        String[] stop = {"the", "was", "and", "a", "is", "of", "in"};
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            boolean skip = false;
            for (String s : stop) if (word.equals(s)) skip = true;
            if (!skip) count.put(word, count.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> keys = new ArrayList<>(count.keySet());
        keys.sort((a, b) -> count.get(b) - count.get(a));
        for (String word : keys) System.out.println(word + ": " + count.get(word));
    }
    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}