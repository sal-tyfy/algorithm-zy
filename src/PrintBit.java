package src;

public class PrintBit {

    public static void print(int num) {
        int printNum;
        // int 32位
        // long 64位
        for (int i = 31; i >= 0; i -= 1) {
            printNum = (num & (1 << i)) == 0 ? 0 : 1;
            System.out.print(printNum);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int num = 311111;
//        print(num);
//        int num2 = 1234;
//        print(num2);
//        System.out.println("");
//        System.out.println(num2 << 3);
//        print(num2 << 3);
//        print(-3);
//        print(Integer.MIN_VALUE);

//        print(Integer.MAX_VALUE);
//        int num4 = Integer.MAX_VALUE;
//        System.out.println((num4 + 1) == Integer.MIN_VALUE);
//        print(num4 + 1);
//        int num5 = 1234;
//        int num6 = ~num5;
//        System.out.println(num6);
//        print(num5);
//        print(num6);
//        int num7 = -1;
//        int num8 = ~num7;
//        System.out.println(num8);
        print(3);
    }
}
