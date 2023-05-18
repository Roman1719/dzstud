public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван","Иванов", 20);
        student.addGrade("Математика", 4);
        student.addGrade("Физика", 5);
        student.addGrade("Информатика", 3);
        student.addGrade("Английский язык", 5,"Французский язык",4);


        System.out.println(student.getAverageGrade());
        System.out.println(student.getGrade("Физика"));
    }
}