class BubbleShort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
