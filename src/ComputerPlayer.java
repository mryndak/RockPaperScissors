import java.util.Random;

public class ComputerPlayer  implements Player {

    public void getName() {

    }


    public int getMove() {
        Random random = new Random();
        int cm = random.nextInt(3);
        return cm;

    }

    public int getPoints() {
        return 1;
    }

    public int addPoints() {
        return 1;


    }
}
