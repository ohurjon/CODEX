package kr.ohurjon.problem.no1712;

import java.util.Scanner;

public class Review1712 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(BEP(A,B,C));

    }

    static int BEP(int A, int B, int C){

        if(B>=C){
            return -1;
        } else {
            return A/ (C-B) + 1;
        }

    }


}








