package by.dmitry.course.classes.object.task1;

public class Test1 {
    private int firstNumber = 10;
    private int secondNumber = 24;

    public int getSumOfNumbers() {
        return firstNumber + secondNumber;
    }

    public int getBiggerNumber() {
        return Math.max(firstNumber, secondNumber);
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "firstNumber = " + firstNumber + " ,secondNumber = " + secondNumber;
    }


}
