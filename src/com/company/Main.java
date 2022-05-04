package com.company;

public class Main {

    public static void main(String[] args) {
	    double [] word = {2.5, 4.5, 5.3, -4.7, 5.9, 8.7, 2.2, -1.5, 11.5, -12.5, 54.5, 14.9, 22.2, 40.1, 51.5};
        double summ = 0;
        int firstMinusIndex = 0;
        int kolichestvo = 0;

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
            if (word[i] < 0) {
                firstMinusIndex = i;
                break;
            }
        }

        for (int i = firstMinusIndex; i < word.length; i++) {
            if (word[i] > 0){
                summ += word[i];
                kolichestvo++;
            }
        }

        System.out.println(summ);
        System.out.println(kolichestvo);
        System.out.println(summ/kolichestvo);
    }
}
