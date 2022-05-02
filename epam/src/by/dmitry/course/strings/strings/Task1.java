package by.dmitry.course.strings.strings;

public class Task1 {

    public static void main(String[] args) {
        String text = "Hello my   wor  ld";
        System.out.printf("Max space count is %s in %s", getMaxSpaceCount(text), text);
    }

    public static int getMaxSpaceCount(String text) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                temp++;
            } else {
                count = Math.max(count, temp);
                temp = 0;
            }
        }
        return count;
    }

}
