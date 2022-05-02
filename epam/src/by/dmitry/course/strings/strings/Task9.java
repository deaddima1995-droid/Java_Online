package by.dmitry.course.strings.strings;

public class Task9 {

    public static void main(String[] args) {
        String text = "hELpы";
        printCountLowerCaseAndHighCase(text);
    }

    public static void printCountLowerCaseAndHighCase(String text) {
        int countLowerCase = 0;
        int countHighCase = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (temp > 64 && temp < 123) {
                if (Character.isLowerCase(temp)) {
                    countLowerCase++;
                } else {
                    countHighCase++;
                }
            }
        }
        System.out.printf("This text has %s letter lower case and %s letter high case",countLowerCase,countHighCase);
    }

}
