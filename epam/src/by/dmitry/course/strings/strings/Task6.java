package by.dmitry.course.strings.strings;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(getDoubleCharactersInString("text"));
    }

    public static String getDoubleCharactersInString(String text) {
        StringBuilder temp = new StringBuilder(text);
        for (int i = text.length() - 1; i >= 0; i--) {
            temp.insert(i, text.charAt(i));
        }
        return temp.toString();
    }
}
