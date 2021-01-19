import java.util.Scanner;

public class InsertionSort {
    static void printArray(int[] a, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void insertionSort(int[] a, int n) {
        int value, index;
        for (int i = 1; i < n; i++) {
            value = a[i];
            index = i;
            while (index > 0 && a[index - 1] > value) {
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
    }

    public static void main (String[] args) {
        int n;
        int a[] = new int[10001];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        insertionSort(a, n);
        printArray(a, n);

        scanner.close();
    }
}

