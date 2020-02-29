import Obstacle.wall;
import Obstacle.treadmill;
import Obstacle.Obstacle;
import Participant.Participant;
import Participant.Robot;
import Participant.Cat;
import Participant.Human;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{new Robot("Valera"), new Human("Vova"), new Cat("BArsik")};
        Obstacle [] obstacles = {new treadmill(1500), new wall (2)};
        for (Participant p: participants){
            for (Obstacle o: obstacles){
                o.doIt(p);
                if (!p.isDistance()){
                    break;
                }

            }
        }
        for (Participant p: participants){
            p.info();
        }
    }

}

