package com.example.demo.SpinWords;

public class SpinWords {

    /*Write a function that takes in a string of one or more words, and returns the same
    string, but with all five or more letter words reversed (Just like the name of
    this Kata). Strings passed in will consist of only letters and spaces. Spaces will be
    included only when more than one word is present.*/

    public String spinWords(String sentence) {
        String[] strings = sentence.split(" ");
        for(int i=0; i<strings.length; i++) {
            if (strings[i].length()>=5) {
                strings[i] = new StringBuilder(strings[i]).reverse().toString();
            }
        }
        return String.join(" ", strings);
    }
}
