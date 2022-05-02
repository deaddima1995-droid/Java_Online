package by.dmitry.course.strings.strings;

public class Task3 {

    public static void main(String[] args) {
        String text = "Tennet";
        System.out.println(isPalindromeWord(text));

    }

    public static boolean isPalindromeWord(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
