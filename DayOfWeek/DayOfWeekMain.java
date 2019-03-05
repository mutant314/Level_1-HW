package Lesson_2;

public class DayOfWeekMain {

       public static void main(String[] args) {
            DayOfWeek day = DayOfWeek.SATURDAY;
            int answer = day.getWorkingHours();

            if(answer == 0)
                System.out.println("Сегодня " + day.getRus() + " - выходной!");
            else System.out.println("До конца рабочей недели осталось " + answer + " часов!");

       }

}
