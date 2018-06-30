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
     public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        //左子树全部入栈
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        //将弹出节点和弹出节点的左子树入栈
        while (!stack.empty()) {
            node = stack.pop();
            list.add(node.val);
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

        }


        return list;
    }
}