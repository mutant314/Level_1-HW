package Lesson_1;

import com.sun.xml.internal.ws.server.ServerRtException;

public class Team implements Competitor {
    String name;
    boolean onDistance;

    public Team (String name){
        this.name = name;
    }

    Competitor[] competitors = new Competitor[]{new Human("John"), new Human("Anzhelika"), new Dog("Smile"), new Cat("Sonia")};


    public boolean isOnDistance() {
        return this.onDistance;
    }

    public void run (int dist) {
    }

    public void swim (int dist) {
    }

    public void jump (int hight) {
    }

    public void info() {
        System.out.println(Team.this.name);
        for (int i = 0; i < competitors.length; i++) {
            System.out.println(competitors[i].getClass().getName());
        }
    }

}
