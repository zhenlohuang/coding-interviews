package net.yidooo.interviews;

/**
 * 二叉树的镜像
 */
public class MirrorBinaryTree {
    public void Mirror(TreeNode root) {
        if(root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            Mirror(left);
            Mirror(right);
            root.left = right;
            root.right = left;
        }
    }
}
