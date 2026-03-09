package L01_OOP_Introduction;
public class Student {
    private String name;
    private double grade;
    private int age;
    private String subject;

    Student(){
        name = "Generic";
        grade = 0.0;
        age = 0;
    }

    Student(String n, int a, double g, String s){
        name = n;
        age = a;
        grade = g;
        subject = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSub() {
        return subject;
    }

    public void setSub(String sub) {
        this.subject = sub;
    }

    public void print(){
        System.out.println("Student: " + name + ", age: " + age +
                ", enrolled in: " + subject + ", earned grade: " + grade + "\n");
    }
}
