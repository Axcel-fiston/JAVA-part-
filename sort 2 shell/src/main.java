import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = generateArray(100); // Generating an array of 100 integers

        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        int opCount1 = shellSort(arr1);
        int opCount2 = mergeSort(arr2, 0, arr2.length - 1);

        System.out.println("Shell Sort operations: " + opCount1);
        System.out.println("Merge Sort operations: " + opCount2);
    }

    public static int shellSort(int[] arr) {
        int n = arr.length;
        int opCount = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    opCount++;
                }
                arr[j] = temp;
            }
        }
        return opCount;
    }

    public static int mergeSort(int[] arr, int l, int r) {
        int opCount = 0;
        if (l < r) {
            int m = (l + r) / 2;

            opCount += mergeSort(arr, l, m);
            opCount += mergeSort(arr, m + 1, r);

            opCount += merge(arr, l, m, r);
        }
        return opCount;
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int opCount = 0;
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = Arrays.copyOfRange(arr, l, m + 1);
        int[] R = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
            opCount++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
            opCount++;
        }

        while (j < n2) {
            arr[k++] = R[j++];
            opCount++;
        }

        return opCount;
    }

    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }
}
