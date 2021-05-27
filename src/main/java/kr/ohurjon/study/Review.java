package kr.ohurjon.study;

public class Review { // 전개도

    // 정보 변수

    //문자
    String t_string = "test";
    char t_char = 't';

    //숫자
    byte t_byte = (byte) 128; // +- 128  2^8 범위 8비트
    short t_short = (short) 320000; // +- 3만 2천 2^16 범위 16비트
    int t_int = 21_0000_0000; // +- 21억 2^32 범위 32비트
    long t_long = 92_0000_0000_0000L; // +-92조 2^64 범위 64비트

    //실수
    float t_float = 1.1234567890f; //소숫점 밑 7 자리까지
    double t_double = 1.12345678901234567;  //소숫점 밑 16자리까지  표현 범위를 넘으면 자동 반올림

    // 메서드 함수..
    public static void main(String[] args){

    }
    public void two(){

    }

    public String getT_string() {
        return t_string;
    }

    public void setT_string(String t_string) {
        this.t_string = t_string;
    }

    public float getT_float() {
        return t_float;
    }

    public void setT_float(float t_float) {
        this.t_float = t_float;
    }

    public Review(String name){
        // 객체를 만들때마다
        setT_string(name);
    }

    public Review(float dsad){
        setT_float(dsad);
    }


}
