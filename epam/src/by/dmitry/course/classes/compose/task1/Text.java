package by.dmitry.course.classes.compose.task1;

import java.util.ArrayList;

public class Text {

    private final Sentence title;
    private final ArrayList<Sentence> text = new ArrayList<>();

    public Text(Sentence title) {
        this.title = title;
    }

    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }

    public void printText() {
        System.out.println(text);
    }

    public void printTitle() {
        System.out.println(title);
    }
}
