package Spil;
import java.util.Scanner;

    public class Spil {
        public static void main(String[] args) {
            Spil spil = new Spil();
            spil.welcome();
        }

        void runApp() {
            //Oprettelse af objekter
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            Spiller spiller1 = new Spiller();
            Spiller spiller2 = new Spiller();
            //Sum variabel
            int sum;
            //Sæt player 1 og player 2's point til nul
            spiller1.setPoint(0);
            spiller2.setPoint(0);
            //Sætter bestemte taster til hver player med scanneren. Spiller 1 får bogstavet a og Spiller 2 får bogstaver l.
            //For hver runde imens player 1 og player 2 har under 40 point så:
            System.out.println("Spiller 1 har fået tildelt tasten 'a' & Spiller 2 har fået tildelt tasten 'l'. Spiller 1 starter :) Tast 'a'");
            for (int runde = 1; spiller1.getPoint() < 40 && spiller2.getPoint() < 40; runde++) {
                System.out.println("Runde " + runde);

                //Opret scanner opjekt for at kunne scanne spillernes inputs
                Scanner scanner = new Scanner(System.in);
                String type = scanner.next();

                //Hvis inputtet er a (uanset stor eller småt bogstav) så

                if (type.equalsIgnoreCase("a")) {

                    //Sæt terning objekterne til random værdier mellem 1 og 6
                    dice1.setFaceValue((int) (Math.random() * 6) + 1);
                    dice2.setFaceValue((int) (Math.random() * 6) + 1);

                    System.out.println("Spiller 1 slog: " + dice1 + " og " + dice2);

                    //tag summen af dice1 og terning 2 og smid dem ind i variablen sum
                    sum = dice1.getFaceValue() + dice2.getFaceValue();

                    //sæt spiller1's point til det antal point playeren har plus den beregnede sum
                    spiller1.setPoint(spiller1.getPoint() + sum);
                    System.out.println("Spiller 1 har: " + spiller1.getPoint() + " point. :)");

                    //Hvis player 1's point eller player 2's point er lig med eller større end 40, så annoncer en vinder og slut programmet
                    if (spiller1.getPoint() >= 40 || spiller2.getPoint() >= 40) {
                        System.out.println("Vinderen er Spiller 1 med " + spiller1.getPoint() + " point!");
                        break;
                    }
                    if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                        spiller1.setPoint(0);
                        System.out.println("Spiller 1 har slået to 1'ere og har derfor mistet alle point. Spiller 1 har: " + spiller1.getPoint() + " point.");
                    }

                    Scanner scanner2 = new Scanner(System.in);
                    String type2 = scanner2.next();

                    if (type2.equalsIgnoreCase("l")) {
                        dice1.setFaceValue((int) (Math.random() * 6) + 1);
                        dice2.setFaceValue((int) (Math.random() * 6) + 1);

                        System.out.println("Spiller 2 slog: " + dice1 + " og " + dice2);
                        sum = dice1.getFaceValue() + dice2.getFaceValue();
                        spiller2.setPoint(spiller2.getPoint() + sum);
                        System.out.println("Spiller 2 har: " + spiller2.getPoint() + " point. :)");
                        if (spiller1.getPoint() >= 40 || spiller2.getPoint() >= 40) {
                            System.out.println("Vinderen er Spiller 2 med " + spiller2.getPoint() + " point!");
                            break;
                        }
                        if (dice1.getFaceValue() == 1 && dice2.getFaceValue() == 1) {
                            spiller2.setPoint(0);
                            System.out.println("Spiller 2 har slået to 1'ere og har derfor mistet alle point. Spiller 1 har: " + spiller2.getPoint() + " point.");
                        }
                    }
                }
            }
        }

        void welcome() {
            System.out.println("Velkommen til terninge-spillet. For at starte spillet: tast 's' :)");
            Scanner scanner = new Scanner(System.in);
            String tast = scanner.next();
            if (tast.equalsIgnoreCase("s")) {
                runApp();
            }
        }
    }