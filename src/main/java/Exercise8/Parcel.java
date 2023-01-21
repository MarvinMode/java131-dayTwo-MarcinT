package Exercise8;

public class Parcel {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean express;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean express) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.express = express;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return express;
    }

    public void setExpress(boolean express) {
        this.express = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLength=" + xLength +
                ", yLength=" + yLength +
                ", zLength=" + zLength +
                ", weight=" + weight +
                ", express=" + express +
                '}';
    }
}


