package Spil;

public class Terning {
    private int faceValue = 0;

    public int getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return String.valueOf(faceValue);
    }
}
