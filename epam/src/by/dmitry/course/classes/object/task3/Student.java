package by.dmitry.course.classes.object.task3;

import java.util.Random;

public class Student {
    public final static Random RND = new Random();
    private final String fullNameOfStudent;
    private final int numberOfGroup;
    private final int[] academicRecord = new int[5];

    public Student(String fullNameOfStudent, int numberOfGroup) {
        this.fullNameOfStudent = fullNameOfStudent;
        this.numberOfGroup = numberOfGroup;
        for (int i = 0; i < academicRecord.length; i++) {
            academicRecord[i] = RND.nextInt(8, 11);
        }
    }

    public void printStudentInfoIfHeHasHighMarks() {
        if (isHasOnlyHighMarks()) {
            System.out.println("\nStudent:" + fullNameOfStudent + " Group:" + numberOfGroup);
            System.out.print("Marks:");
            for (int j : academicRecord) {
                System.out.print(j + "\s");
            }
        }
    }

    private boolean isHasOnlyHighMarks() {
        for (int j : academicRecord) {
            if (j < 9) {
                return false;
            }
        }
        return true;
    }
}
