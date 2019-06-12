package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HasSubtreeTest {
    @Test
    public void testHasSubtree1() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);

        Assert.assertTrue(new HasSubtree().HasSubtree(root1, root2));
    }

    @Test
    public void testHasSubtree2() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(6);

        Assert.assertFalse(new HasSubtree().HasSubtree(root1, root2));
    }
}
