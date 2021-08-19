package kr.ohurjon.study;

public class Space {
    int function(int a,int b, int c){
        return (a+b+c)*a*b*c;
    }

    int function2(int n){
        int fac = 1;
        for (int i = 2; i < n+1; i++) {
            fac = fac*i;
        }
        return fac;
    }

    int function3(int n){
        if(n>1) {
            return n*function3(n-1);
        } else {
            return 1;
        }
    }
}
