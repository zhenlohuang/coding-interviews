package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class FindPathTest {
    @Test
    public void testTargetFound() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> path1 = new ArrayList<>();
        path1.add(1);
        path1.add(2);
        path1.add(5);
        expected.add(path1);
        ArrayList<Integer> path2 = new ArrayList<>();
        path2.add(1);
        path2.add(3);
        path2.add(4);
        expected.add(path2);
        Assert.assertEquals(new FindPath().FindPath(root, 8), expected);
    }

    @Test
    public void testTargetNotFound() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        Assert.assertEquals(new FindPath().FindPath(root, 6), Collections.emptyList());
    }
}
