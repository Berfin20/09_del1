package spil;
import gui_main.GUI;

public class Spil {


    public static void main(String[] args) {
        GUI gui = new GUI();
        Terning terning = new Terning();
        Terning tern = new Terning();

        Player player1 = new Player();
        Player player2 = new Player();
        int terning1;
        int terning2;
        int terning3;
        int terning4;


        player1.setPoint(0);
        player2.setPoint(0);


        for (int runde = 0; player1.getPoint() < 40 && player2.getPoint()<40; runde++) {
            terning1 = (int) (Math.random() * 6) + 1;
            terning2 = (int) (Math.random() * 6) + 1;

            gui.setDice(terning1, terning2);

            terning.setSum(terning1+terning2);
            player1.setPoint(player1.getPoint()+terning.getSum());

            System.out.println("Player 1: terning 1 er: " + terning1 + " og terning 2 er: "+ terning2);
            System.out.println("Player 1: summen for runden er: " + terning.getSum());
            System.out.println("Player 1's point er: " + player1.getPoint());
            System.out.println("-----------------------------------------");

            terning3 = (int) (Math.random() * 6) + 1;
            terning4 = (int) (Math.random() * 6) + 1;
            gui.setDice(terning3, terning4);

            tern.setSum(terning3+terning4);
            player2.setPoint(player2.getPoint()+tern.getSum());

            System.out.println("Player 2: terning 1 er: " + terning3 + " og terning 2 er: "+ terning4);
            System.out.println("Player 2: summen for runden er: " + terning.getSum());
            System.out.println("Player 2's point er: " + player2.getPoint());
            System.out.println("-----------------------------------------");
        }




}
}
