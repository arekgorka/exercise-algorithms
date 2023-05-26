package com.example.demo.RomanNumeralsEncoder;

public class RomanNumeralsEncoder {
    /*Create a function taking a positive integer between 1 and 3999 (both included) as its parameter
    and returning a string containing the Roman Numeral representation of that integer.

    Modern Roman numerals are written by expressing each digit separately starting with the left most
    digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered:
    1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
    1666 uses each Roman symbol in descending order: MDCLXVI.

    Symbol    Value
    I          1
    V          5
    X          10
    L          50
    C          100
    D          500
    M          1,000*/

    public String solution(int n) {
        if (n>=1 && n<=3999) {
            char[] arrayNumber = String.valueOf(n).toCharArray();
            char iJednosci = arrayNumber[arrayNumber.length-1];
            String sJednosci = switch (iJednosci) {
                case '1' -> "I"; case '2' -> "II"; case '3' -> "III";
                case '4' -> "IV"; case '5' -> "V"; case '6' -> "VI";
                case '7' -> "VII"; case '8' -> "VIII"; case '9' -> "IX";
                default -> "";
            };
            char iDziesiatki = 'd';
            if (arrayNumber.length > 1) {
                iDziesiatki = arrayNumber[arrayNumber.length-2];
            }
            String sDziesiatki = switch (iDziesiatki) {
                case '1' -> "X"; case '2' -> "XX"; case '3' -> "XXX";
                case '4' -> "XL"; case '5' -> "L"; case '6' -> "LX";
                case '7' -> "LXX"; case '8' -> "LXXX"; case '9' -> "XC";
                default -> "";
            };
            char iSetki = 's';
            if (arrayNumber.length > 2) {
                iSetki = arrayNumber[arrayNumber.length-3];
            }
            String sSetki = switch (iSetki) {
                case '1' -> "C"; case '2' -> "CC"; case '3' -> "CCC";
                case '4' -> "CD"; case '5' -> "D"; case '6' -> "DC";
                case '7' -> "DCC"; case '8' -> "DCCC"; case '9' -> "CM";
                default -> "";
            };
            char iTysiac = 't';
            if (arrayNumber.length > 3) {
                iTysiac = arrayNumber[arrayNumber.length-4];
            }
            String sTysiace = switch (iTysiac) {
                case '1' -> "M"; case '2' -> "MM"; case '3' -> "MMM";
                default -> "";
            };
            return sTysiace.concat(sSetki).concat(sDziesiatki).concat(sJednosci);
        } else {
            return "";
        }
    }
}
