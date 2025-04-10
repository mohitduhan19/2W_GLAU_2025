
package W.Lec9_Lab;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public void help(TreeNode node, int tar, List<Integer> list, List<List<Integer>> ans) {
        if (node == null)
            return;
        list.add(node.val);
        if (node.left == null && node.right == null && node.val == tar) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }

        help(node.left, tar - node.val, list, ans);

        help(node.right, tar - node.val, list, ans);
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        help(root, targetSum, list, ans);
        return ans;
    }
}
