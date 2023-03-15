package com.example.demo.CreditCounter;

public class CreditCounter {

    double amount;
    double year;
    double percent;

    public CreditCounter(double amount, double year, double percent) {
        this.amount = amount;
        this.year = year;
        this.percent = percent;
    }

    // obliczanie sumy wartości kredytu
    public double countCredit(double amount, double year, double percent) {
        double kosztKredytu = 0;
        double splataRoczna = amount / year;
        for(int i = 1; i<= year; i++) {
            double kwotaPoz = amount - (splataRoczna * (i-1));
            kosztKredytu = kosztKredytu + (kwotaPoz * percent - kwotaPoz);
        }
        double suma = amount + kosztKredytu;
        return (double) Math.round(suma);
    }
}
