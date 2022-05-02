package by.dmitry.course.strings.strings;

public class Task2 {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("apple in bag");
        addBLetterAfterA(text);
        System.out.println(text);
    }

    public static void addBLetterAfterA(StringBuilder text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                text.insert(i + 1, 'b');
            }
        }
    }
}
