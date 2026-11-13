package arrays_and_strings.assigment_problems;
public class InventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int sumA = 0, sumB = 0, max = Integer.MIN_VALUE, section = 0, index = 0;
        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];
            if (sectionA[i] > max) { max = sectionA[i]; section = 1; index = i; }
            sumB += sectionB[i];
            if (sectionB[i] > max) { max = sectionB[i]; section = 2; index = i; }
        }
        System.out.print("Section A Total: " + sumA + " | Section B Total: " + sumB);
        System.out.print(" | Status: " + (sumA == sumB ? "Balanced" : "Not Balanced"));
        System.out.println(" | Highest Quantity: " + max + " (Section " +
                (section == 1 ? "A" : "B") + ", Item " + (index + 1) + ")");
    }
    public static void main(String[] args) {
        analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
    }
}