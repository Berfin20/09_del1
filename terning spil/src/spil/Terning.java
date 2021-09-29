package spil;

public class Terning {

    private int faceValue;
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
