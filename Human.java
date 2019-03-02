
package Lesson_1;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean active;

    public boolean isOnDistance() {
        return this.active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    public void run(int dist) {
        if (dist <= this.maxRunDistance) {
            System.out.println(this.name + " хорошо справился с кроссом");
        } else {
            System.out.println(this.name + " не справился с кроссом");
            this.active = false;
        }

    }

    public void jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println(this.name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(this.name + " не смог перепрыгнуть стену");
            this.active = false;
        }

    }

    public void swim(int dist) {
        if (dist <= this.maxSwimDistance) {
            System.out.println(this.name + " отлично проплыл");
        } else {
            System.out.println(this.name + " не смог проплыть");
            this.active = false;
        }

    }

    public void info() {
        System.out.println(this.name + " - " + this.active);
    }

    String getName() {
        return this.name;
    }
}
