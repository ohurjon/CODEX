package kr.ohurjon.problem.no1011;

import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            array[i] = function(sc.nextInt(),sc.nextInt());
        }

        for (int arg: array) {
            System.out.println(arg);
        }

    }

    static int function(int X,int Y){
        int length = Y-X;
        double sqrt = Math.sqrt(length);
        int intsqrt = (int) sqrt;
        if(intsqrt == sqrt){
            return intsqrt*2-1;
        }
        if(Math.pow(intsqrt,2) + intsqrt >= length){
            return intsqrt*2;
        }
        if(Math.pow(intsqrt+1,2) >= length){
            return intsqrt*2+1;
        }
        return -1;
    }
}
