package by.dmitry.course.classes.compose.task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private final ArrayList<Word> sentence = new ArrayList<>();

    public Sentence(Word... words) {
        sentence.addAll(List.of(words));
    }

    public void addWordsToSentence(Word... words) {
        sentence.addAll(List.of(words));
    }

    public void addWordToSentence(Word word) {
        sentence.add(word);
    }

    private String getString() {
        StringBuilder builder = new StringBuilder();
        for (Word word : sentence) {
            builder.append(word);
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    @Override
    public String toString() {
        return getString() + ".";
    }
}
