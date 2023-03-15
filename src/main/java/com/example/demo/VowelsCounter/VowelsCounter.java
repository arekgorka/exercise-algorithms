package com.example.demo.VowelsCounter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public class VowelsCounter {

    public int getCountWithIterator(String str) {
        int count = 0;
        String s = str.toLowerCase(Locale.ROOT);
        String[] strings = s.split("");
        Iterator<String> iterator = Arrays.stream(strings).iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("a") || element.equals("e") || element.equals("i") || element.equals("o") || element.equals("u")) {
                count++;
            }
        }
        return count;
    }

    public int getCountWithFor(String str) {
        int count = 0;
        String s = str.toLowerCase(Locale.ROOT);
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
                count++;
            }
        }
        return count;
    }
}
