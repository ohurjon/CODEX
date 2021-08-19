package kr.ohurjon.today.no1072;

import java.util.Scanner;

public class Main1072 {

    static long MIN = 0L;
    static long MAX = 1000000000;

    static long VALUE = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long Y = sc.nextLong();

        System.out.println(function(X,Y));
    }

    static long function(long x, long y) {
        if(MIN <= MAX){
            long mid = (MAX + MIN) / 2 ;
            if( per(x,y) < per(x+mid, y+mid)) {
                VALUE = mid;
                MAX = mid - 1;
            } else {
                MIN = mid + 1;
            }
            return function(x,y);
        } else {
            return VALUE;
        }
    }

    static int per(long x, long y){
        if(y == 0L) {
            return 0;
        } else {
            return (int) (y*100/x);
        }
    }




}
