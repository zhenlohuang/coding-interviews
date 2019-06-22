package net.yidooo.interviews;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        Set<String> result = new TreeSet<>();
        if(str != null && str.length() > 0) {
            permutation(str.toCharArray(), 0, result);
        }

        return new ArrayList<>(result);
    }

    private void permutation(char[] chars, int start, Set<String> result) {
        if(start == chars.length - 1) {
            result.add(String.valueOf(chars));
        } else {
            for(int i = start; i < chars.length; i++) {
                swap(chars, start, i);
                permutation(chars, start + 1, result);
                swap(chars, start, i);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
