package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        int recursiveInt = 0;
        if (!list.isEmpty()) {
            if (list.get(0).equals(target)) {
                return 0;
            }
            recursiveInt = recursiveIndexOf(list.subList(1, list.size()), target);
            if (recursiveInt == -1) {
                return -1;
            } else{
                return recursiveInt + 1;
            }
        }
        return -1;
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        return recursiveIndexOf(list, target);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        int recursiveInt = 0;
        if (!list.isEmpty()) {
            if (list.get(0) == "") {
                return 0;
            }
            recursiveInt = recursiveIndexOfEmpty(list.subList(1, list.size()));
            if (recursiveInt == -1) {
                return -1;
            } else{
                return recursiveInt + 1;
            }
        }
        return -1;
    }

    public static int recursivePut(String target, List<String> list) {
        int recursiveInt = recursiveIndexOfEmpty(list);
        if (recursiveInt == -1) {
            return -1;
        }
        list.add(recursiveInt, target);
        return recursiveInt;
    }

    public static int recursiveRemove(List<String> list, String target) {
        if (!list.isEmpty()) {
            if (list.get(0).equals(target)) {
                list.remove(0);
                return recursiveRemove(list, target) + 1;
            }
            return recursiveRemove(list.subList(1, list.size()), target);
        }
        return 0;
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0) +  recursiveSum(list.subList(1, list.size()));
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * recursivePow(base, exponent - 1);
    }

    public static int recursiveFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() != 1 && word.length() != 0) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return  recursivePalindrome(word.substring(1, word.length() - 1));
            }
            return false;
        }
        return true;
    }


}
