package ds.string;

public class StringDemo {


    public void stringPalindrome(String str) {
        String newStr = new StringBuilder(str).reverse().toString();
        if (str.equals(newStr)) {
            System.out.println(str + " String is palindrome");
        } else {
            System.out.println(str + " String is not palindrome");
        }
    }

    public void stringPalindrome2(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                System.out.println(str + " String is not palindrome");
                return;
            }
        }
        System.out.println(str + " String is palindrome");
    }

    public void stringPalindrome3(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                System.out.println("'" + str + "' String is not palindrome!!!");
                return;
            }
            start++;
            end--;
        }
        System.out.println("'" + str + "' String is palindrome!!!");
    }


    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        stringDemo.stringPalindrome("madam");
        stringDemo.stringPalindrome2("madam");
        stringDemo.stringPalindrome3("madam");
    }
}
