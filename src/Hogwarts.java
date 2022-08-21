public class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int transgressionDistance;

    public String getFullName() {
        return fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts(String fullName, int powerMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }
}
