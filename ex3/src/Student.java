public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Grade[] grades;
    private int gradesCount;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = new Grade[0];
        this.gradesCount = 0;
    }

    public void addGrade(String subject, int grade) {
        Grade newGrade = new Grade(subject, grade);
        this.gradesCount++;
        Grade[] newGrades = new Grade[this.gradesCount];
        System.arraycopy(this.grades, 0, newGrades, 0, this.grades.length);
        newGrades[this.gradesCount - 1] = newGrade;
        this.grades = newGrades;
    }

    public void addGrade(String subject1, int grade1, String subject2, int grade2) {
        addGrade(subject1, grade1);
        addGrade(subject2, grade2);
    }

    public double getAverageGrade() {
        if (this.grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i].getGrade();
        }
        return sum / this.grades.length;
    }

    public int getGrade(String subject) {
        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i].getSubject().equals(subject)) {
                return this.grades[i].getGrade();
            }
        }
        return -1;
    }
}
