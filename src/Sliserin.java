public class Sliserin extends Hogwarts{
    private int cunning; //Хитрость
    private int determination; //Решительность
    private int ambition;  //Амбициозность
    private int ingenuity; //Находчивость
    private int influence; //Влиятельность(жажда власти)

    public void printStudentInfo() {
        System.out.println( "Имя и Фамилия: " + this.getFullName() +
                ", Сила магии: " + this.getPowerMagic() +
                ", Дальность трансгрессии: " + this.getTransgressionDistance() +
                ", Хитрость: " + this.cunning +
                ", Решительность: " + this.determination  +
                ", Амбициозность: " + this.ambition  +
                ", Находчивость: " + this.ingenuity  +
                ", Жажда власти: " + this.influence );
    }

    public Sliserin(String fullName, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int ingenuity, int influence) {
        super(fullName, powerMagic,transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.influence = influence;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }
}
