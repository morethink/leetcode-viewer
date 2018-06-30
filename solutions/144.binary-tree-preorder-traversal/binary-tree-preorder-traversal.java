/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while (node != null) {
            list.add(node.val);
            stack.push(node);
            node = node.left;
        }

        while (!stack.empty()) {
            node = stack.pop().right;
            while (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            }

        }


        return list;
    }
}