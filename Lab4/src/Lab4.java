import java.util.Comparator;
import java.util.*;

public class Lab4 {
    public static void main(String[] args) {

        //515 mod 11 = 9

        Student John = new Student("John", 18, 2, "alpha", 4.8);
        Student Bill = new Student("Bill", 25, 3, "alpha", 3.7);
        Student Bob = new Student("Bob", 22, 3, "alpha", 4.0);
        Student Ana = new Student("Ana", 20, 4, "alpha", 4.9);
        Student Soren = new Student("Soren", 19, 2, "alpha", 3.6);
        Student Elisa = new Student("Elise", 19, 3, "alpha", 3.5);
        Student Dante = new Student("Dante", 22, 1, "alpha", 2.1);
        Student Vergil = new Student("Vergil", 23, 4, "alpha", 5.0);
        Student[] group = {John, Bill, Bob, Ana, Soren, Elisa, Dante, Vergil};

        System.out.println("Sort by ascending age");
        Arrays.sort(group, Comparator.comparing(Student::getAge));
        PrintGroup(group, "age");


        System.out.println("\nSort by descending average mark");
        Arrays.sort(group, Collections.reverseOrder());
        PrintGroup(group, "avg");

    }
    public static void PrintGroup(Student[] group, String field){
        switch (field){
            case "age": {
                for (Student elem : group
                ) {
                    System.out.println(elem.name + ": " + elem.age);
                }
                break;
            }
            case "avg": {
                for (Student elem : group
                ) {
                    System.out.println(elem.name + ": " + elem.averageMark);
                }
                break;
            }
        }

    }

}

class Student implements Comparable<Student> {
    public Student(String name, int age, int course, String group, double averageMark) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String name;
    public int age;
    public int course;
    public String group;
    public double averageMark;
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student obj) {
        if (this.averageMark < obj.averageMark) {
            /* текущее меньше полученного */
            return -1;
        } else if (this.averageMark > obj.averageMark) {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }
}
