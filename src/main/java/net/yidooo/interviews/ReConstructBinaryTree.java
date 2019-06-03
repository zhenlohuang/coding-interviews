package net.yidooo.interviews;

/**
 * 	重建二叉树
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0) {
            return null;
        } else {
            return buildTree(pre, 0, in, 0, in.length - 1);
        }
    }

    private TreeNode buildTree(int[] preorder, int startOfPreorder, int[] inorder, int startOfInorder, int endOfInorder) {
        if(startOfPreorder > preorder.length - 1 || startOfInorder > endOfInorder) {
            return null;
        } else {
            TreeNode root = new TreeNode(preorder[startOfPreorder]);

            int rootIndexOfInorder = 0;
            for(int i = 0; i < inorder.length; i++) {
                if(inorder[i] == root.val) {
                    rootIndexOfInorder = i;
                    break;
                }
            }

            int sizeOfLeftTree = rootIndexOfInorder - startOfInorder;

            root.left = buildTree(preorder, startOfPreorder + 1, inorder, startOfInorder, rootIndexOfInorder - 1);
            root.right = buildTree(preorder, startOfPreorder + sizeOfLeftTree + 1, inorder, rootIndexOfInorder + 1, endOfInorder);

            return root;
        }
    }
}
