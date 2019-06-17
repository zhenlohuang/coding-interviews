package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertTest {
    @Test
    public void testBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode head = new Convert().Convert(root);
        TreeNode tail = null;
        List<Integer> sequence = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        TreeNode p = head;
        while(p != null) {
            sequence.add(p.val);
            if(p.right == null) {
                tail = p;
            }
            p = p.right;
        }
        p = tail;
        while(p != null) {
            reverse.add(p.val);
            p = p.left;
        }

        Assert.assertEquals(sequence, Arrays.asList(2 , 1, 3));
        Assert.assertEquals(reverse, Arrays.asList(3 , 1, 2));
    }

    @Test
    public void testEmptyBinaryTree() {
        Assert.assertNull(new Convert().Convert(null));
    }
}
