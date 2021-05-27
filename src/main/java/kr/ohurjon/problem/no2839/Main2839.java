package kr.ohurjon.problem.no2839;

import java.util.Scanner;

public class Main2839 {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();

        System.out.println(MIN_SUGAR(sugar));

    }

    static int MIN_SUGAR(int sugar) {
        if (sugar % 5 == 0) {
            return sugar / 5;
        } else {
            if(sugar > 5) {
                if (sugar % 5 == 1) {
                    return sugar / 5 + 1;
                }
                if (sugar % 5 == 2) {
                    if (sugar >= 12) {
                        return sugar / 5 + 2;
                    } else {
                        return -1;
                    }
                }
                if (sugar % 5 == 3) {
                    return sugar / 5 + 1;
                }
                return sugar / 5 + 2;
            } else {
                if(sugar % 3 == 0){
                    return sugar/3;
                }
            }
            return -1;
    }
}
}
