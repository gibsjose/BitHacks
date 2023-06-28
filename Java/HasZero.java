package Java;

import Java.Utils.Print;

/*
 * #define haszero(v) (((v) - 0x01010101UL) & ~(v) & 0x80808080UL)
 */
public class HasZero {

    private static int getUnsignedByte(byte b) {
        return b & 0x0FF;
    }

    private static int getUnsignedShort(short data) {
        return data & 0x0F;
    }

    private static long getUnsignedInt(int data) {
        // data & 0xFFFFFFFF 和 data & 0xFFFFFFFFL 结果是不同的，需要注意，有可能与 JDK
        return data & 0xFFFFFF;
    }

    public static void main(String[] args) {
        System.out.println(0x01010101);
        System.out.println(getUnsignedInt(0x01010101));
        Print.printIntInShift(0x01010101);
        System.out.println(0x80808080);
        System.out.println(getUnsignedInt(0x80808080));
    }
}