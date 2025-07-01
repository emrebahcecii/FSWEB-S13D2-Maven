package org.example;

import static java.lang.Integer.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi){
        if(sayi<0){
            sayi = -sayi;
        }
        int orijinal = sayi;
        int ters = 0;

        while(sayi>0){
            int basamak = sayi % 10;
            ters = ters * 10 + basamak;
            sayi = sayi / 10;
        }
        return orijinal == ters ;
    }

    public static boolean isPerfectNumber(int sayi){
        if(sayi<0){
            return false;
        }
        int toplam = 0;
        for (int i = 1; i<sayi; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        return toplam == sayi;
    }

    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }
        if (sayi == 0) {
            return "Zero";
        }

        String sayiStr = String.valueOf(sayi);
        StringBuilder sonuc = new StringBuilder();

        for (int i = 0; i < sayiStr.length(); i++) {
            char rakam = sayiStr.charAt(i);

            switch (rakam) {
                case '0':
                    sonuc.append("Zero ");
                    break;
                case '1':
                    sonuc.append("One ");
                    break;
                case '2':
                    sonuc.append("Two ");
                    break;
                case '3':
                    sonuc.append("Three ");
                    break;
                case '4':
                    sonuc.append("Four ");
                    break;
                case '5':
                    sonuc.append("Five ");
                    break;
                case '6':
                    sonuc.append("Six ");
                    break;
                case '7':
                    sonuc.append("Seven ");
                    break;
                case '8':
                    sonuc.append("Eight ");
                    break;
                case '9':
                    sonuc.append("Nine ");
                    break;
            }
        }
        return sonuc.toString().trim();
    }

}
