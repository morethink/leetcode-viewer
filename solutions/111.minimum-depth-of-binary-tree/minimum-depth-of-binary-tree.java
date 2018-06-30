/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left, right = root.right;
        if (left == null && right == null) {
            return 1;
        }
        if (left == null && right != null) {
            return minDepth(right) + 1;
        }
        if (right == null && left != null) {
            return minDepth(left) + 1;
        }
        int leftHeight = minDepth(left);
        int rightHeight = minDepth(right);
        return leftHeight < rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
}