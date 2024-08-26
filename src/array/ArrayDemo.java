package array;

public class ArrayDemo {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        printArray(arr);
        System.out.println("Array length: " + arr.length);
        System.out.println("Array element at index 3: " + arr[3]);
        System.out.println("Array element last index: " + arr[arr.length - 1]);

        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        printArray(arr1);
        System.out.println("Array length: " + arr1.length);
    }


    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.arrayDemo();
    }
}

