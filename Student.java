public class Student{
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayGrade(double grade){
        System.out.println("Grade: " + grade + "%");
    }

}
