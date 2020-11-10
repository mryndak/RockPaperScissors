public class Application {

    public static void main(String[] args) {
        UserInformation user1 = new UserInformation();
        Rules rules1 = new Rules();
        int o = 0;
        int ph = 0;
        int pc = 0;

        System.out.println(user1.getInformation());
        System.out.println(rules1.getRules());


        while (o<3) {
            int hm = new HumanPlayer().getMove();
            int cm = new ComputerPlayer().getMove();

            System.out.println(hm + " - Your choice");
            System.out.println(cm + " - Computer choice");


            if (hm == 0) {
                if(cm == 2) {
                    System.out.println("You win!");
                    new HumanPlayer().addPoints();
                    o++;
                    ph++;
                } if(cm==1) {
                    System.out.println("Computer win!");
                    new ComputerPlayer().addPoints();
                    o++;
                    pc++;
                } if (cm == 0) {
                    System.out.println("Draw!");
                    new HumanPlayer().addPoints();
                    new ComputerPlayer().addPoints();
                    o++;

                }
            }
            if (hm == 1) {
                if (cm == 0) {
                    System.out.println("You win!");
                    new HumanPlayer().addPoints();
                    o++;
                    ph++;
            } if (cm == 1) {
                    System.out.println("Draw!");
                    new HumanPlayer().addPoints();
                    new ComputerPlayer().addPoints();
                    o++;

                } if( cm==2 ) {
                    System.out.println("Computer win!");
                    new ComputerPlayer().addPoints();
                    o++;
                    pc++;
                }

            }
            if (hm == 2) {
                if(cm == 0) {
                    System.out.println("Computer win!");
                    new ComputerPlayer().addPoints();
                    o++;
                    pc++;
                } if (cm == 1) {
                    System.out.println("You win!");
                    new HumanPlayer().addPoints();
                    o++;
                    ph++;
                } if (cm == 2) {
                    System.out.println("Draw!");
                    new HumanPlayer().addPoints();
                    new ComputerPlayer().addPoints();
                    o++;

                }



            }
        }
        System.out.println("For computer: " + pc + "\n" + "And for you: " + ph);

    }

}
