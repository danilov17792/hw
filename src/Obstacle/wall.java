package Obstacle;

import Participant.Participant;

public class wall implements Obstacle {
    int height;

    public wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump (height);
    }
}