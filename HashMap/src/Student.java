public class Student {
    int grade;
    int cls;
    String firstName;
    String lastName;

    public Student(int grade, int cls, String firstName, String lastName) {
        this.grade = grade;
        this.cls = cls;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public int hashCode(){
        int B = 31;
        int hash = 0;
        hash = hash*B + grade;
        hash = hash*B + cls;
        hash = hash*B + firstName.hashCode();
        hash = hash*B + lastName.hashCode();
        return hash;
     }

}
