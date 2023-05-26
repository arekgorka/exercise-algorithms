package com.example.demo.MissingLetter;

public class MissingLetter {

    /*Write a method that takes an array of consecutive (increasing) letters as input
    and that returns the missing letter in the array.
    You will always get an valid array. And it will be always exactly one letter be missing.
    The length of the array will always be at least 2.
    The array will always contain letters in only one case.
    (Use the English alphabet with 26 letters!)*/

    public char missingLetter(char[] array) {
        char missingLetter = array[0];
        for (char letter: array) {
            if(letter != missingLetter) break;
            missingLetter++;
        }
        return missingLetter;
    }
}
