public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);

        char c = 'a';
        short c2 = (short)c;
        test(c2);

    }

    // byte -> short -> int
    private static void test(byte b) {
        System.out.println("bbbb");
    }
    private static void test(short b) {
        System.out.println("cccc");
    }
    private static void test(char b) {
        System.out.println("dddd");
    }
    private static void test(int b) {
        System.out.println("eeee");
    }
}
