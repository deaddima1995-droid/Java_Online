package by.dmitry.course.classes.compose.task1;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word toUpperCase() {
        return new Word(word.toUpperCase());
    }

    @Override
    public String toString() {
        return word + " ";
    }
}
