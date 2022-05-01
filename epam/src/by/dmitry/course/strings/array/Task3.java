package by.dmitry.course.strings.array;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(getCountDigits("chars1234".toCharArray()));
    }

    public static int getCountDigits(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                count++;
            }
        }
        return count;
    }
}
