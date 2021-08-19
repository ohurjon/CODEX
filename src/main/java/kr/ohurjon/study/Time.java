package kr.ohurjon.study;

public class Time {

    int a = 0, b = 0;

    public static void main(String[] args){

    }

    void function(int N){
        int a = 0, b = 0;

        for (int i = 1; i < N; i++) {
            a = a + rand();
        }

        for (int j = 2; j < N; j++) {
            b = b + rand();
        }
    }


    void function2(int N){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a = a + j;
            }
        }
        for (int k = 0; k < N; k++) {
            b = b + k;
        }
    }

    void function3(int N){
        int a = 0;
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                a = a + i + j;
            }
        }
    }





    private int rand() {
        return -1;
    }

}


