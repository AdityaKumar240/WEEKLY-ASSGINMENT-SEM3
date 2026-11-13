package arrays_and_strings.assigment_problems;
public class TypingAccuracyChecker {
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0, firstMismatch = -1;
        int n = Math.min(original.length(), typed.length());
        for (int i = 0; i < n; i++) {
            if (original.charAt(i) == typed.charAt(i)) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        double accuracy = original.length() == 0 ? 100.0 :
                matched * 100.0 / Math.max(original.length(), typed.length());
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, original.length(), accuracy);
        if (firstMismatch == -1 && original.length() == typed.length())
            System.out.println(" | No Mismatches");
        else {
            if (firstMismatch == -1) firstMismatch = n;
            System.out.println(" | First Mismatch at position " + (firstMismatch + 1));
        }
    }
    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
}