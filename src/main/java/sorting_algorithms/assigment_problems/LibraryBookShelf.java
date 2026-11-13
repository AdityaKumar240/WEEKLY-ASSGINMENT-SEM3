package sorting_algorithms.assigment_problems;
import java.util.*;
public class LibraryBookShelf {
    static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int book = books[i];
            int j = i - 1;
            while (j >= 0 && books[j] > book) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = book;
            System.out.println("After placing " + book + ": " + Arrays.toString(books));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) books[i] = sc.nextInt();
        shelf(books);
    }
}