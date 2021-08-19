package kr.ohurjon.problem.no8959;

import java.util.Scanner;

public class Review8959 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            array[i] = function(sc.next());
        }

        for(int N : array){
            System.out.println(N);
        }


    }

    static int function(String A){
        //
        return -1;
    }
}
