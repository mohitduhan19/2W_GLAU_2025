package W.Lec3_Lab;

public class coin_change {
    private int recursion(int index, int[] arr, int t) {
        if (index == 0) {
            if (t % arr[index] == 0) return t / arr[index];
            else return -1;
        }

        int notTake = recursion(index - 1, arr, t);
        int take = Integer.MAX_VALUE;
        if (arr[index] <= t) {
            take = 1 + recursion(index, arr, t - arr[index]);
        }
        return Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        return recursion(coins.length-1 ,coins, amount);
    }
}
