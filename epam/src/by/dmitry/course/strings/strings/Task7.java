package by.dmitry.course.strings.strings;

public class Task7 {

    public static void main(String[] args) {
        String text = "abc cde def";
        text = deleteRepeaterLetter(text);
        System.out.println(text);
    }

    public static String deleteRepeaterLetter(String text) {
        StringBuilder temp = new StringBuilder(text);
        for (int i = 0; i < temp.length(); i++) {
            if (i != temp.lastIndexOf(Character.toString(temp.charAt(i)))) {
                temp.deleteCharAt(temp.lastIndexOf(Character.toString(temp.charAt(i))));
            }
        }
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                temp.deleteCharAt(i);
            }
        }
        return temp.toString();
    }
}
