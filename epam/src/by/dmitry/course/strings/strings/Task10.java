package by.dmitry.course.strings.strings;

public class Task10 {

    public static void main(String[] args) {
        String text =
                 "My sister is a nervous girl, but she is very kind. " +
                 "My grandmother also lives with us. " +
                 "She came from Italy when I was two years old. " +
                 "She has grown old, but she is still very strong. " +
                 "She cooks the best food!" +
                 "How old was I when my grandmother came?"
        ;
        System.out.println(getCountSentenceOfText(text));
    }

    public static int getCountSentenceOfText(String text) {
        int count = text.split("[!?\\.]").length;
        return count;
    }
}
