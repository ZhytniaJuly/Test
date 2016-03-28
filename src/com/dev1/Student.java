package com.dev1;

public class Student implements Comparable
{
    public int student_id;
    public String last_name;
    public String first_name;

    public Student(int student_id, String last_name, String first_name)
    {
        this.student_id = student_id;
        this.last_name = last_name;
        this.first_name = first_name;
    }

  /* Перегрузка метода compareTo */

    public int compareTo(Object obj)
    {
        Student tmp = (Student)obj;
        if(this.student_id < tmp.student_id)
        {
      /* > */
            return -1;
        }
        else if(this.student_id > tmp.student_id)
        {
      /* < */
            return 1;
        }
      /* = */
        return 0;
    }

}
