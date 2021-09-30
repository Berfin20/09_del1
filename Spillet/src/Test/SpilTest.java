package Test;

public class SpilTest {
    public static void main(String[] args) {
        int dice1;
        int counter = 0;
        int enere = 0;
        int toere = 0;
        int treere = 0;
        int firere = 0;
        int femere = 0;
        int seksere = 0;

        while(counter<1000){
            dice1 = (int) (Math.random() * 6) + 1;
            switch (dice1) {
                case 1 -> enere++;
                case 2 -> toere++;
                case 3 -> treere++;
                case 4 -> firere++;
                case 5 -> femere++;
                case 6 -> seksere++;
            }
            counter++;
            System.out.println("enere: " + enere + ", toere: " + toere + ", treere: " + treere + ", firere: " + firere + ", femere: " + femere + ", seksere: " + seksere);

        }
    }
}
