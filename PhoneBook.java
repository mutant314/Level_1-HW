package Lesson_3;

//    Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи.
//    С помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны.
//    Желательно как можно меньше добавлять своего, чего нет в задании
//    (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
//    делать взаимодействие с пользователем через консоль и т.д.).
//    Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> telBook = new HashMap<>();

        telBook.put("89164600001", "Jolly");
        telBook.put("89164600003", "Osbourne");
        telBook.put("89164600002", "Pitt");
        telBook.put("89164600004", "Osbourne");
        telBook.put("89164600005", "Wahlberg");
        telBook.put("89164600006", "Bale");
        telBook.put("89164600007", "Fox");
        telBook.put("89164600008", "Hardy");
        telBook.put("89164600009", "Aniston");
        telBook.put("89164600010", "Smith");
        telBook.put("89164600011", "Laurie");
        telBook.put("89164600012", "Walken");

        String findName = "Osbourne";

        Set<Map.Entry<String, String>> set = telBook.entrySet();
        for (Map.Entry<String, String> me : set) {
            if(me.getValue().equalsIgnoreCase(findName)) {
                System.out.println(me.getKey());
            }
        }
    }
//    public String getTel(String Value){
//        String key = null;
//        Set<Map.Entry<String, String>> set = telBook.entrySet();
//        for (Map.Entry<String, String> me : set) {
//            if(me.getValue().equalsIgnoreCase(Value)) {
//                System.out.println(me.getKey());
//                key = me.getKey();
//            }
//        }
//        return key;
//    }

}
