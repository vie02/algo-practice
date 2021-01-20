import java.util.Scanner;

public class SelectionSort {
    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void selectionSort(int[] a, int n) {
        int temp;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
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

        selectionSort(a, n);
        printArray(a, n);

        scanner.close();
    }
}


