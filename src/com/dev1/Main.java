package com.dev1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
  /* Create array of object - Student */

        Student[] students = new Student[5];
        students[0] = new Student(96123,"Petrov","Ivan");
        students[1] = new Student(12345,"Ivanov","Petr");
        students[2] = new Student(2378,"Sidorov","Sergey");
        students[3] = new Student(12,"Tkach","Dmitro");
        students[4] = new Student(5,"Leonov","Ivan");

        System.out.println ("------------------------");
        System.out.println ("Default List of Students");
        System.out.println ("------------------------");
        for (Student student : students) {
            System.out.println(student.student_id +" "+
                    student.last_name +" "+ student.first_name);
        }
  /* Sorting array */
        Arrays.sort(students);

  /* Print and sorting of values */
        System.out.println ("------------------------------");
        System.out.println ("List of Students Sorting by id");
        System.out.println ("------------------------------");
        for (Student student : students) {
            System.out.println(student.student_id +" "+
                    student.last_name +" "+ student.first_name);
        }
    }
}
