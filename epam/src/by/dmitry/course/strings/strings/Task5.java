package by.dmitry.course.strings.strings;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(getCountLetterAInString("Apple in bag"));
    }

    public static int getCountLetterAInString(String text) {
        String temp = text.toLowerCase();
        int count = 0;
        int index = temp.indexOf("a", 0);
        while (index != -1) {
            count++;
            index = temp.indexOf("a", index + 1);
        }
        return count;
    }
}
