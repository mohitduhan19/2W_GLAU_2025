package W.L3_Theory_Lab;
import java.util.*;
public class Subsequence {
   public static void findSubsequences(int curr, int[] arr, List<Integer> subarr, List<List<Integer>> res) {
        if (curr == arr.length) {
            res.add(new ArrayList<>(subarr));
            return;
        }

        subarr.add(arr[curr]);
        findSubsequences(curr + 1, arr, subarr, res);
        subarr.remove(subarr.size() - 1);

        findSubsequences(curr + 1, arr, subarr, res);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<Integer> subarr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        findSubsequences(0, arr, subarr, res);


        for (List<Integer> subsequence : res) {
            for (int num : subsequence) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

    }
}
