import java.util.Arrays;

 class MinHeap {
    private int[] data;
    private int size;

    public MinHeap(int capacity) {
        data = new int[capacity + 1];
        size = 0;
    }

    public void insert(int value) {
        data[++size] = value;
        shiftUp(size);
    }

    public int delete(int i) {
        int ret = data[1];
        data[1] = data[size--];
        shiftDown(1);
        return ret;
    }

    public boolean contains(int value) {
        for (int i = 1; i <= size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    private void shiftUp(int index) {
        while (index > 1) {
            if (data[index] < data[index / 2]) {
                swap(index, index / 2);
            } else {
                break;
            }
            index /= 2;
        }
    }

    private void shiftDown(int index) {
        while (index * 2 <= size) {
            int childIndex = index * 2;
            if (childIndex + 1 <= size && data[childIndex + 1] < data[childIndex]) {
                childIndex++;
            }
            if (data[childIndex] < data[index]) {
                swap(childIndex, index);
            } else {
                break;
            }
            index = childIndex;
        }
    }

    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    @Override
    public String toString() {
        return "MinHeap{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(100);
        minHeap.insert(15);
        minHeap.insert(40);
        minHeap.insert(30);
        minHeap.insert(50);
        minHeap.insert(10);
        minHeap.insert(100);
        minHeap.insert(40);
        minHeap.contains(40);

        System.out.println(minHeap.contains(40)); // Print true
        minHeap.delete(10); // Delete 10
        System.out.println(minHeap); // Print the heap
    }
}