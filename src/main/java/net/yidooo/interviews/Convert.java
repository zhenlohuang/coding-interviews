package net.yidooo.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树与双向链表
 */
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree != null) {
            List<TreeNode> sequences = new ArrayList<>();
            inOrderTraversal(pRootOfTree, sequences);

            TreeNode head = sequences.get(0);
            head.left = null;
            sequences.get(sequences.size() - 1).right = null;
            for(int i = 0; i < sequences.size(); i++) {
                if(i - 1 >= 0) {
                    sequences.get(i).left = sequences.get(i - 1);
                }
                if(i + 1 < sequences.size()) {
                    sequences.get(i).right = sequences.get(i + 1);
                }
            }

            return head;
        } else {
            return null;
        }
    }

    private void inOrderTraversal(TreeNode root, List<TreeNode> sequences) {
        if(root != null) {
            if(root.left != null) {
                inOrderTraversal(root.left, sequences);
            }
            sequences.add(root);
            if(root.right != null) {
                inOrderTraversal(root.right, sequences);
            }
        }
    }
}
