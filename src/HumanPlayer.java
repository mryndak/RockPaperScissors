import java.util.Scanner;

public class HumanPlayer implements Player {

    Scanner scan1 = new Scanner(System.in);

    public void getName() {


    }


    public int getMove() {
      int hm = scan1.nextInt(3);
      return hm;


    }


    public int getPoints() {

        return 1;
    }


    public int addPoints() {
        return 1;

    }
}
