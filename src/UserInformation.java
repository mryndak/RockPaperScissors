import java.util.Scanner;

public class UserInformation {


    Scanner scan = new Scanner(System.in);


    public String getName() {
        System.out.println("Type your name:  ");
        String n = scan.nextLine();
        return n ;
    }

    public String getAge() {
        System.out.println("Type your age:  ");
        String a = scan.nextLine();
        return a;
    }

    public String getCompPlayer() {

        return "Player 2: Computer";
    }

    public String getInformation() {

        return "Player 1: " + getName() + " " + getAge() + " " + " \n" + getCompPlayer();
    }

}

