package Spil;

public class Player {
    private int point;

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }


//    public void roll(String string){
//        if (type.equalsIgnoreCase("a")) {
//
//            //Sæt terning objekterne til random værdier mellem 1 og 6
//            terning1.setFaceValue((int) (Math.random() * 6) + 1);
//            terning2.setFaceValue((int) (Math.random() * 6) + 1);
//
//            System.out.println("Player 1 slog: " + terning1 + " og " + terning2);
//
//            //tag summen af terning1 og terning 2 og smid dem ind i variablen sum
//            sum = terning1.getFaceValue() + terning2.getFaceValue();
//
//            //sæt player1's point til det antal point playeren har plus den beregnede sum
//            player1.setPoint(player1.getPoint() + sum);
//            System.out.println("Player 1 har: " + player1.getPoint() + " point. :)");
//
//            //Hvis player 1's point eller player 2's point er lig med eller større end 40, så annoncer en vinder og slut programmet
//            if (player1.getPoint() >= 40 || player2.getPoint() >= 40) {
//                System.out.println("Vinderen er player 1 med " + player1.getPoint() + " point!");
//                break;
//            }
//            if (terning1.getFaceValue()==1 && terning2.getFaceValue()==1){
//                player1.setPoint(0);
//                System.out.println("Player 1 har slået to 1'ere og har derfor mistet alle point. Player 1 har: " + player1.getPoint() + " point.");
//            }
//    }

}
