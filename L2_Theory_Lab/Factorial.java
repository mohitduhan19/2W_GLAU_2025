package W.L2_Theory_Lab;

public class Factorial {
    static int factorial(int n) {
        if(n <= 1)return 1;
        int temp = factorial(n-1);
        return n*temp;

    }
}
