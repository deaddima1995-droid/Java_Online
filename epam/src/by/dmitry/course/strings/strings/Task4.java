package by.dmitry.course.strings.strings;

public class Task4 {

    public static void main(String[] args) {
        String first = "информатика";
        StringBuilder out = new StringBuilder();
        out.append(first.charAt(7))
                .append(first.substring(3, 5))
                .append(first.charAt(7)
                );
        System.out.println(out);
    }
}
