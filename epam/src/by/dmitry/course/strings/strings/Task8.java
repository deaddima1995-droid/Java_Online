package by.dmitry.course.strings.strings;

public class Task8 {

    public static void main(String[] args) {
        String text = "English texts for beginners to practice reading and comprehension online and for free";
        System.out.println(getTheLongestWordInText(text));
    }

    public static String getTheLongestWordInText(String text) {
        String[] array = text.split(" ");
        String out = "";
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                out = array[i];
            }
        }
        return out;
    }
}
