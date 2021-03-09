import java.util.HashMap;
import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {
        Student student = new Student(3,2,"lol", "lol");
        System.out.println(student.hashCode());

        HashSet<Student> set = new HashSet<>();
        set.add(student);
        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(student, 100);
    }
}
