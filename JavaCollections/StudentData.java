package collections;

/**
 * Write a program to sort Student objects based on score,
 * if the scores are the same then sort on first name
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String Name;
    double score;
    double age;

    public Student(String firstName, double score, double age) {
        this.Name = firstName;
        this.score = score;
        this.age = age;
    }
    String getName()
    {
        return Name;
    }
    double getScore()
    {
        return score;
    }
}

public class StudentData {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Clay", 70.5, 22));
        studentList.add(new Student("Alex", 70.5, 21));
        studentList.add(new Student("Mandy", 89.0, 25));
        studentList.add(new Student("Tom", 69.0, 22));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore())
                    return o1.getName().compareToIgnoreCase(o2.getName());
                else if(o1.getScore()<o2.getScore())
                    return -1;
                else
                    return 1;
            }
        });

        for (Student s : studentList)
            System.out.println(s.Name + " is " + s.age + " and has scored " + s.score);
    }
}
