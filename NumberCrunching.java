public class NumberCrunching {
    public static void reverseOfNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        System.out.print(reverse);
        System.out.println();
    }

    public static void countDigit1(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void countDigit2(int n) {
        String num = Integer.toString(n);
        System.out.println(num.length());

    }

    public static void main(String[] args) {
        int num = 1233;
        reverseOfNumber(num);
        countDigit1(num);
        countDigit2(num);
    }

}