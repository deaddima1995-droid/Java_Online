package by.dmitry.course.classes.object.task3;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        String[] names = new String[]{"Dima", "Ivan", "Irina", "Elena", "Misha", "Artem", "Svetlana", "Sasha", "Oleg", "Vladimir"};
        int[] group = {1, 2, 5, 4};
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], group[Student.RND.nextInt(group.length)]);
            students[i].printStudentInfoIfHeHasHighMarks();
        }
    }
}
