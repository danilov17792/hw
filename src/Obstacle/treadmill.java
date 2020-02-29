package Obstacle;

import Participant.Participant;

public class treadmill implements Obstacle {
    int length;

    public treadmill(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {

        participant.run (length);
    }
}

