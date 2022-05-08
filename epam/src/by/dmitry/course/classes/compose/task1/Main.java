package by.dmitry.course.classes.compose.task1;

public class Main {

    public static void main(String[] args) {
        Word[] world = {
                new Word("Hello"),
                new Word("my"),
                new Word("World")
        };
        Word[] night = {
                new Word("Good"),
                new Word("night"),
                new Word("friends")
        };
        Text text = new Text(new Sentence(new Word("Main title").toUpperCase()));

        text.addSentence(new Sentence(world));
        text.addSentence(new Sentence(night));
        System.out.println(text);

    }
}
