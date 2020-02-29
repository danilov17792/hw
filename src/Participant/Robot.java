package Participant;

public class Robot implements Participant {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Robot (String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Robot (String name) {
        this(name, 20000, 8);
    }

    @Override
    public void run (int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал");
        }
        else {
            System.out.println(name + " не пробежал");
            onDistance = false;
        }

    }

    @Override
    public void jump(int heig) {
        if (heig <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул");
        }
        else {
            System.out.println(name + " не перепрыгнул");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + onDistance);
    }
}

