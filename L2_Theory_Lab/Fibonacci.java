package W.L3_Theory_Lab;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) { // Base cases: F(0) = 0, F(1) = 1
            return n;
        }
        int last = fibonacci(n-1);
        int Second_last = fibonacci(n-2);
        return last + Second_last;// Recursive formula: F(n) = F(n-1) + F(n-2)
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
