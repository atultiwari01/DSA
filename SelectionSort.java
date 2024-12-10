public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 45, 88, 11};
        System.out.println("array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sortarray:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
