package net.yidooo.interviews;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> currentPath = new ArrayList<>();
        int currentSum = 0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        inOrderTraversal(root, currentPath, currentSum, result, target);

        return result;
    }

    private void inOrderTraversal(TreeNode node, ArrayList<Integer> currentPath, int currentSum,
                                  ArrayList<ArrayList<Integer>> result, int target) {
        if(node != null) {
            int newSum = currentSum + node.val;
            currentPath.add(node.val);
            if(node.left == null && node.right == null && newSum == target) {
                result.add((ArrayList<Integer>) currentPath.clone());
            } else if(newSum < target) {
                if(node.left != null) {
                    inOrderTraversal(node.left, currentPath, newSum, result, target);
                }
                if(node.right != null) {
                    inOrderTraversal(node.right, currentPath, newSum, result, target);
                }
            }
            currentPath.remove(currentPath.size() - 1);
        }
    }
}
