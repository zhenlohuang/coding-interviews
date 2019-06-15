package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 二叉搜索树的后序遍历序列
 */
public class VerifySequenceOfBSTTest {
    @Test
    public void testSingleNodeTree() {
        Assert.assertTrue(new VerifySequenceOfBST().VerifySquenceOfBST(new int[]{1}));
    }

    @Test
    public void testEmptyTree() {
        Assert.assertFalse(new VerifySequenceOfBST().VerifySquenceOfBST(new int[]{}));
    }

    @Test
    public void testCorrectSeq() {
        Assert.assertTrue(new VerifySequenceOfBST().VerifySquenceOfBST(new int[]{4,8,6,12,16,14,10}));
    }

    @Test
    public void testIncorrectSeq() {
        Assert.assertFalse(new VerifySequenceOfBST().VerifySquenceOfBST(new int[]{7,4,6,5}));
    }

}
