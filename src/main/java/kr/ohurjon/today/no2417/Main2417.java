package kr.ohurjon.today.no2417;

import java.util.Scanner;

public class Main2417 {

    static long MIN = 0L;
    static long MAX = (long) Math.pow(2,63);

    static long VALUE = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(function(n));
    }

    static long function(long n){
        if(MIN <= MAX){
            long mid = (MIN + MAX) / 2;
            if( n <= Math.pow(mid,2) ) {
                VALUE = mid;
                MAX = mid -1;
            } else {
                MIN = mid + 1;
            }
            return function(n);
        } else {
            return VALUE;
        }
    }

}
