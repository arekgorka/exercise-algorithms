package com.example.demo.CamelCase;

import java.util.Locale;

public class CamelCase {

    /*Write simple camelCase method for strings.
    All words must have their first letter capitalized without spaces.*/

    public String camelCase(String str) {
        String[] strings = str.split(" ");
        for (int i=0; i<strings.length; i++) {
            String[] letters = strings[i].split("");
            letters[0] = letters[0].toUpperCase(Locale.ROOT);
            strings[i] = String.join("",letters);
        }
        return String.join("",strings);
    }
}
