package W.L3_Theory_Lab;

public class Print_Number {
    public static void printNumbers(int current, int n) {
        if (current > n) { // Base case: stop when current exceeds n
            return;
        }
        System.out.println(current); // Print the current number
        printNumbers(current + 1, n); // Recursive call with the next number
    }
    public static void main(String[] args) {
        int n = 10; // Specify the value of n
        printNumbers(1, n); // Start printing from 1
    }
}
