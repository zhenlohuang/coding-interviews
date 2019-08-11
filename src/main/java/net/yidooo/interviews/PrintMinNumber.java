package net.yidooo.interviews;

import java.util.*;

/**
 * 把数组排成最小的数
 */
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0) {
            return "";
        }

        List<Integer> copyNumbers = new ArrayList<>();
        for(int num : numbers) {
            copyNumbers.add(num);
        }

        copyNumbers.sort((num1, num2) -> {
            String str1 = String.valueOf(num1);
            String str2 = String.valueOf(num2);
            return (str1 + str2).compareTo((str2 + str1));
        });

        StringBuilder resultBuilder = new StringBuilder();
        for(int num: copyNumbers) {
            resultBuilder.append(num);
        }

        return resultBuilder.toString();
    }
}
