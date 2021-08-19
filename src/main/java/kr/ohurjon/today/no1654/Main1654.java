package kr.ohurjon.today.no1654;

import java.util.Scanner;

public class Main1654 {

    static long MIN = 0L;
    static long MAX = (long) Math.pow(2,63);

    static long VALUE = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        long N = sc.nextLong();

        long[] arr = new long[K];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(function(arr,N));
    }

    static long function(long[] K, long N){

    }

}
