package kr.ohurjon.study;

import kr.ohurjon.study.Student;

import java.util.ArrayList;

public class Study {

    public static void main(String[] args) {

        Student student = new Student("오유준",20413);
        Student student2 = new Student("김룡현",20403);
        Student student3 = new Student("박민우", 20409);
        Student student4 = new Student("홍성훈", 10227);
        Student student5 = new Student("이효건", 10620);
        Student student6 = new Student("양승호", 10909);


        ArrayList<Student> list = new ArrayList<Student>();

        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        Student[] students = new Student[6];

        students[0] = student;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;

        for (Student s: list) {
            System.out.println(s.getName());
        }

        for (Student s2: students) {
            System.out.println(s2.getNumber());
        }
    }
}

