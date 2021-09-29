package Spil;

import java.util.Scanner;

    public class Spil {
        //Oprettelse af objekter
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        Player player1 = new Player();
        Player player2 = new Player();

        //Sum variabel
        int sum;

        void runApp() {
            //Sæt player 1 og player 2's point til nul
            player1.setPoint(0);
            player2.setPoint(0);
            //Sætter bestemte taster til hver player med scanneren. Player 1 får bogstavet a og Player 2 får bogstaver l.
            //For hver runde imens player 1 og player 2 har under 40 point så:
            System.out.println("Player 1 har fået tildelt tasten 'a' & Player 2 har fået tildelt tasten 'l'. Player 1 starter :) Tast 'a'");
            for (int runde = 1; player1.getPoint() < 40 && player2.getPoint() < 40; runde++) {
                System.out.println("Runde " + runde);

                //Opret scanner opjekt for at kunne scanne spillernes inputs
                Scanner scanner = new Scanner(System.in);
                String type = scanner.next();

                //Hvis inputtet er a (uanset stor eller småt bogstav) så

                if (type.equalsIgnoreCase("a")) {

                    //Sæt terning objekterne til random værdier mellem 1 og 6
                    terning1.setFaceValue((int) (Math.random() * 6) + 1);
                    terning2.setFaceValue((int) (Math.random() * 6) + 1);

                    System.out.println("Player 1 slog: " + terning1 + " og " + terning2);

                    //tag summen af terning1 og terning 2 og smid dem ind i variablen sum
                    sum = terning1.getFaceValue() + terning2.getFaceValue();

                    //sæt player1's point til det antal point playeren har plus den beregnede sum
                    player1.setPoint(player1.getPoint() + sum);
                    System.out.println("Player 1 har: " + player1.getPoint() + " point. :)");

                    //Hvis player 1's point eller player 2's point er lig med eller større end 40, så annoncer en vinder og slut programmet
                    if (player1.getPoint() >= 40 || player2.getPoint() >= 40) {
                        System.out.println("Vinderen er player 1 med " + player1.getPoint() + " point!");
                        break;
                    }
                    if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) {
                        player1.setPoint(0);
                        System.out.println("Player 1 har slået to 1'ere og har derfor mistet alle point. Player 1 har: " + player1.getPoint() + " point.");
                    }

                    Scanner scanner2 = new Scanner(System.in);
                    String type2 = scanner2.next();

                    if (type2.equalsIgnoreCase("l")) {
                        terning1.setFaceValue((int) (Math.random() * 6) + 1);
                        terning2.setFaceValue((int) (Math.random() * 6) + 1);

                        System.out.println("Player 2 slog: " + terning1 + " og " + terning2);
                        sum = terning1.getFaceValue() + terning2.getFaceValue();
                        player2.setPoint(player2.getPoint() + sum);
                        System.out.println("Player 2 har: " + player2.getPoint() + " point. :)");
                        if (player1.getPoint() >= 40 || player2.getPoint() >= 40) {
                            System.out.println("Vinderen er player 2 med " + player2.getPoint() + " point!");
                            break;
                        }
                        if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) {
                            player2.setPoint(0);
                            System.out.println("Player 2 har slået to 1'ere og har derfor mistet alle point. Player 1 har: " + player2.getPoint() + " point.");
                        }
                    }
                }
            }
        }

        void welcome(){
            System.out.println("Velkommen til terninge-spillet. For at starte spillet: tast 's' :)");
            Scanner scanner = new Scanner(System.in);
            String tast = scanner.next();
            if (tast.equalsIgnoreCase("s")) {
                runApp();
            }
        }

        public static void main(String[] args) {
            Spil spil = new Spil();
            spil.welcome();
           }
        }