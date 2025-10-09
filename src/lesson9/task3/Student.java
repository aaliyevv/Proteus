package lesson9.task3;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "lesson16.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

}
