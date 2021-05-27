package kr.ohurjon.problem.no8959;

import java.util.Scanner;

public class Main8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            array[i] = function(sc.next());
        }

        for (int arg: array) {
            System.out.println(arg);
        }

    }

    static int function(String Line){
        int N = 0;
        for( String A : Line.split("X")){
            N += A.length()*(A.length()+1)/2;
        }
        return N;
    }
}
