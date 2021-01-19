import java.util.Scanner;

public class BubbleSort {
    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void bubbleSort(int[] arr, int n) {
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
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

        bubbleSort(a, n);
        printArray(a, n);

        scanner.close();
    }
}
