package by.dmitry.course.classes.object.task10.data;

public enum Destination {
    MINSK(33),
    LONDON(14),
    KIEV(101),
    BERLIN(20),
    NEW_YORK(34);

    public final int numberLine;
    Destination(int numberLine) {
        this.numberLine = numberLine;
    }
}
