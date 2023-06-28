package Java.Utils;

public class Print {

    /*
     * print int in the from "1 << n; 1 << m;..."
     */
    public static void printIntInShift(int n) {
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                System.out.print("1 << " + (str.length() - i - 1) + ";");
            }
        }
        System.out.println();
    }
}
