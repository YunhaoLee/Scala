public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2); // 引用类型判断的是引用地址
        System.out.println(s1.equals(s2)); // 判断内容

        // 赋值运算符
        byte b = 10;
        b = (byte) (b + 1); // 需要强转
        b += 1; // +=自带强转
        System.out.println(b);

        // 自增自减
        int x = 15;
        int y = x ++;
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++ x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x ++;  // temp = x; x ++; x = temp
        System.out.println("x = " + x);
    }
}
