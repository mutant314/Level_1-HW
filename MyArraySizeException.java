package Lesson_2;

public class MyArraySizeException extends Exception {
    private int num;

    public int getNum(int num) {
        return num;
    }

    public MyArraySizeException (String msg, int num) {
        super(msg);
        this.num = num;
    }

}
