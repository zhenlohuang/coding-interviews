package net.yidooo.interviews;

/**
 * 树的子结构
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        } else {
            return isSameTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root2 == null) {
            return true;
        } else if(root1 == null) {
            return false;
        } else if(root1.val == root2.val) {
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        } else {
            return false;
        }
    }
}
