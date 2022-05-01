package by.dmitry.course.strings.array;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(getCountNumbers("11go1go2g123o123".toCharArray()));
    }

    public static int getCountNumbers(char[] chars) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < chars.length - 1; i++) {
            if (flag && !Character.isDigit(chars[i])) {
                count++;
            }
            flag = Character.isDigit(chars[i]);
        }
        if (flag || Character.isDigit(chars[chars.length - 1])) {
            count++;
        }
        return count;
    }
}
