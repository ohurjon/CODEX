package kr.ohurjon.study;

class Student {

    int number;
    String name;

    public Student(String name, int number) {

        setName(name);
        setNumber(number);

    }

    // getter
    String getName() {
        return this.name;
    }

    int getNumber(){
        return this.number;
    }

    //setter

    void setName(String name){
        this.name = name;
    }

    void setNumber(int number){
        this.number = number;
    }
}

