public  class Main {
    public static void main(String[] args) {
        Student stu = new Student("Aayush", 20);
        stu.displayInfo();
        double grade = GradeCalculator.calcGrade(99.0,78.0,90.0);
        stu.displayGrade(grade);
    }
    
}