public class Main {
    public static void main(String[] args) {
        Student student = new Student("����","������", 20);
        student.addGrade("����������", 4);
        student.addGrade("������", 5);
        student.addGrade("�����������", 3);
        student.addGrade("���������� ����", 5,"����������� ����",4);


        System.out.println(student.getAverageGrade());
        System.out.println(student.getGrade("������"));
    }
}