package kr.ohurjon.problem.no1712;

import java.util.Scanner;

public class Main1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //고정 비용
        int B = sc.nextInt(); //가변 비용
        int C = sc.nextInt(); //노트북 가격

        System.out.println(BEP(A,B,C));

    }

    static int BEP(int A, int B, int C){
        if( B >= C ){
            return -1;
        } else {
            return A / (C-B) + 1;
        }
    }

}
