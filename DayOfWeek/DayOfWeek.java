package Lesson_2;

public enum DayOfWeek {
     MONDAY("Понеделльнтк", 40), TYESDAY("Вторник", 32), WEDNESDAY("Среда", 24), THURSDAY("Четверг", 16), FRIDAY("Пятница", 8), SATURDAY("Суббота", 0), SANDAY("Воскресенье", 0);

     private String rus;
     private int hours;

     DayOfWeek(String rus, int hours) {
         this.rus = rus;
         this.hours = hours;
     }

     public String getRus() {
         return rus;
     }

     public int getWorkingHours() {
         return hours;
     }


}

