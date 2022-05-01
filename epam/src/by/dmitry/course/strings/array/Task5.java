package by.dmitry.course.strings.array;


public class Task5 {

    public static void main(String[] args) {
        char[] text = " hello  m  y  world  ".toCharArray();
        text = deleteDoubleSpace(text);
        Task1.printCharArray(text);
    }

    public static char[] deleteDoubleSpace(char[] chars) {
        char[] out = chars;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] == ' ' && chars[i - 1] == ' ') {
                out = removeCharInCharArray(out, i);
            }
        }
        if (out[0] == ' ') out = removeCharInCharArray(out, 0);
        if (out[out.length - 1] == ' ') out = removeCharInCharArray(out, out.length - 1);
        return out;
    }

    public static char[] removeCharInCharArray(char[] chars, int index) {
        char[] out = new char[chars.length - 1];
        for (int i = 0; i < chars.length; i++) {
            if (i < index) {
                out[i] = chars[i];
            } else if (i > index) {
                out[i - 1] = chars[i];
            }
        }
        return out;
    }
}
