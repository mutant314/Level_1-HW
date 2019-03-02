package Lesson_1;

public class Course extends Obstacle {

    Obstacle[] course = new Obstacle[] {new Cross(500), new Wall(2), new Water(300)};

    public void doIt(Competitor competitor) {
        for (int i = 0; i < course.length; i++) {
            System.out.println((i + 1) + " пошел!");
        }
    }
}
