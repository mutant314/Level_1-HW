
package Lesson_1;

public class Animal implements Competitor {
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return this.onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int dist) {
        if (dist <= this.maxRunDistance) {
            System.out.println(this.type + " " + this.name + " хорошо справился с кроссом");
        } else {
            System.out.println(this.type + " " + this.name + " не справился с кроссом");
            this.onDistance = false;
        }

    }

    public void jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println(this.type + " " + this.name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(this.type + " " + this.name + " не смог перепрыгнуть стену");
            this.onDistance = false;
        }

    }

    public void swim(int dist) {
        if (this.maxSwimDistance == 0) {
            System.out.println(this.type + " " + this.name + " не умеет плавать");
            this.onDistance = false;
        } else {
            if (dist <= this.maxSwimDistance) {
                System.out.println(this.type + " " + this.name + " отлично проплыл");
            } else {
                System.out.println(this.type + " " + this.name + " не смог проплыть");
                this.onDistance = false;
            }

        }
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " - " + this.onDistance);
    }
}
