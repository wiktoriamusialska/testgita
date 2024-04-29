package src;

import java.util.Arrays;

public class LoopCheck {
    public static void main(String[] args) {


    for (int i=1; i<=100; i++) {
        if (i%3==0){
            System.out.println(i);
        }
    }
    int[] lottoNumbers = new int[] {1,3,5};

    System.out.println("The original array is: ");
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
    lottoNumbers[0]=5;lottoNumbers[2]=1;
        System.out.println("\nThe modified array is: ");
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
        //alternatywna metoda
        /*int temp=0;
        for( int i = 0; i < lottoNumbers.length/2; ++i )
        {
            temp = lottoNumbers[i];
            lottoNumbers[i] = lottoNumbers[lottoNumbers.length - i - 1];
            lottoNumbers[lottoNumbers.length - i - 1] = temp;
        }
        System.out.println("\nThe modified array is: ");
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        } */


}}
