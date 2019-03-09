package Lesson_3;

//    Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать, сколько раз встречается каждое слово.

import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();

        str.add("London");
        str.add("is");
        str.add("the");
        str.add("capital");
        str.add("of");
        str.add("Great");
        str.add("Britain");
        str.add("London");
        str.add("one");
        str.add("of");
        str.add("the");
        str.add("largest");
        str.add("cities");
        str.add("in");
        str.add("the");
        str.add("world");

        System.out.println(str);
        System.out.println("Размер текста " + str.size() + " слов.");

        LinkedList<String> strNew = new LinkedList<>();

        int counter;
        for (int i = 0; i < str.size(); i++) {
            counter = 1;
            for (int j = 0; j < str.size(); j++) {
                if (i == j)
                    continue;
                if (str.get(i).equalsIgnoreCase(str.get(j))) {
                    if(strNew.contains(str.get(j)));
                    strNew.add(str.get(j));
                    counter++;
                }
            }
            System.out.println(str.get(i) + " - " + counter);
        }
        str.removeAll(strNew);
        System.out.println(str);
    }
}
