package ds.array;

public class ArrayDemo {

    public void printArray(int[] arr) {
        System.out.println("Array length: " + arr.length);
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

    public void removeEventIntegerFromArray(int[] arr) {
        System.out.println("Given Array length: " + arr.length);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        printArray(arr);
        System.out.println("Result Array length: " + arr.length);
    }

    public void removeEventIntegerFromArray2(int[] arr) {
        printArray(arr);
        int n = arr.length;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd Element Count: " + oddCount);
        int[] newArr = new int[oddCount];
        int index = 0;
        int[] newArr2 = new int[oddCount];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                newArr[oddCount - 1] = arr[i];
                oddCount--;

                newArr2[index] = arr[i];
                index++;
            }
        }
        printArray(newArr);
        printArray(newArr2);
    }

    public void reverseArray(int[] arr) {
        printArray(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        printArray(arr);
    }

    public void reverseArray2(int[] arr) {
        printArray(arr);
        int end = arr.length;
        int start = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }

    public void minimumElement(int[] arr) {
        printArray(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " + min);
    }

    public void secondMaximumElement(int[] arr) {
        printArray(arr);
        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax > arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second Maximum Element: " + secondMax);
    }

    public void moveZerosToEnd(int[] arr) {
        printArray(arr);
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
        printArray(arr);
    }

    public void moveZerosToEnd2(int[] arr) {
        printArray(arr);
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        printArray(arr);
    }

    public int[] resizeArray(int[] arr, int newSize) {
        printArray(arr);
        System.out.println("Requested New Array length: " + newSize);
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        printArray(arr);
        return arr;
    }

    public void missingNumber1ton(int[] arr) {
        printArray(arr);
        int n = arr.length;
        int total = ((n + 1) * (n + 1 + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Missing Number: " + (total - sum));
    }


    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.arrayDemo();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayDemo.removeEventIntegerFromArray(arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayDemo.removeEventIntegerFromArray2(arr2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayDemo.reverseArray(arr3);

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayDemo.reverseArray(arr4);

        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayDemo.reverseArray2(arr5);

        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayDemo.minimumElement(arr6);

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};
        arrayDemo.secondMaximumElement(arr7);

        int[] arr8 = {0, 1, 0, 3, 12};
        arrayDemo.moveZerosToEnd(arr8);

        int[] arr9 = {0, 1, 0, 3, 12};
        arrayDemo.moveZerosToEnd2(arr9);

        int[] arr10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int newSize = 15;
        arrayDemo.resizeArray(arr10, newSize);

        int[] arr11 = {1, 2, 3, 5};
        arrayDemo.missingNumber1ton(arr11);


    }
}

