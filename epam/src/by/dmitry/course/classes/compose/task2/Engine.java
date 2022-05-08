package by.dmitry.course.classes.compose.task2;

public enum Engine {
    PETROL(1.0),
    GAS(1.2),
    DIESEL(0.9);
    
    final double value;

    Engine(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
