
package Lesson_1;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    public void doIt(Competitor competitor) {
        competitor.run(this.length);
    }
}
