package Lesson_2;

public class Array {

    public static int getArr(String[][] arr) throws MyArraySizeException {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = 0;
            for (int j = 0; j < arr[i].length; j++) {
                num++;
            }
            if(num != 4) throw new MyArraySizeException("Колличество столбцов массива не равно 4", num);
        }
        if(arr.length != 4) throw new MyArraySizeException("Колличество строк массива не равно 4", arr.length);

        return num;
    }

    public static int getIntArr(String[][] arr) throws MyArrayDataException {
        int[][] intArr = new int[4][4];
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[i].length; j++) {
                    intArr[i][j] = Integer.parseInt(arr[i][j]);
                    sum = sum + intArr[i][j];
//                    if (intArr[i][j] instanceof String) throw new MyArrayDataException("Ошибка в ячейке " + "[" + (i + 1) + "][" + (j + 1) + "]", intArr[i][j]);
                }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        String[][] arr = {
                {"1", "2", "4", "6"},
                {"1", "3", "5", "7o"},
                {"5", "7", "9", "11"},
                {"4", "6", "8", "10"},
        };
        try {
            getArr(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        try {
            System.out.println("Сумма элементов массива равна "  + getIntArr(arr));
//        } catch (MyArrayDataException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        System.out.println("Проверка");
    }
}


