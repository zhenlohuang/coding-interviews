package net.yidooo.interviews;

public class VerifySequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) {
            return false;
        } else {
            return verifySequenceOfBST(sequence, 0, sequence.length - 1);
        }
    }

    private boolean verifySequenceOfBST(int[] sequence, int start, int end) {
        if((end - start) <= 0) {
            return true;
        } else {
            int root = sequence[sequence.length - 1];
            int i = start;
            while(i < end && sequence[i] < root) {
                i++;
            }
            for(int j = i + 1; j < end; j++) {
                if(sequence[j] < sequence[end]) {
                    return false;
                }
            }

            return verifySequenceOfBST(sequence, start, i - 1)
                    && verifySequenceOfBST(sequence, i, end - 1);
        }
    }
}
