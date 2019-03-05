package Lesson_2;

public class MyArrayDataException extends Exception {
    private int num;

    public int getNum(int num) {
        return num;
    }

    public MyArrayDataException (String msg, int num) {
        super(msg);
        this.num = num;
    }
}
