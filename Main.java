
package Lesson_1;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
//        Competitor[] competitors = new Competitor[]{new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = new Obstacle[]{new Cross(80), new Wall(2), new Wall(1), new Water(120)};
//        Competitor[] var3 = competitors;
//        int var4 = competitors.length;
//
//        int var5;
//        Competitor c;
//        for(var5 = 0; var5 < var4; ++var5) {
//            c = var3[var5];
//            Obstacle[] var7 = course;
//            int var8 = course.length;
//
//            for(int var9 = 0; var9 < var8; ++var9) {
//                Obstacle o = var7[var9];
//                o.doIt(c);
//                if (!c.isOnDistance()) {
//                    break;
//                }
//            }
//        }
//
//        var3 = competitors;
//        var4 = competitors.length;
//
//        for(var5 = 0; var5 < var4; ++var5) {
//            c = var3[var5];
//            c.info();
//        }

        Team team = new Team("Dream_Team");
        team.info();
        Course c = new Course();
        c.doIt(team);


    }
}
