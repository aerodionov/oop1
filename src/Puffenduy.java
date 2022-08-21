public class Puffenduy extends Hogwarts{
    private int  diligence; //Трудолюбие
    private int loyalty;    //Верность
    private int honesty;    //Честность

    public void printStudentInfo() {
        System.out.println( "Имя и Фамилия: " + this.getFullName() +
                ", Сила магии: " + this.getPowerMagic() +
                ", Дальность трансгрессии: " + this.getTransgressionDistance() +
                ", Трудолюбие: " + this.diligence +
                ", Верность: " + this.loyalty  +
                ", Честность: " + this.honesty );
    }


    public Puffenduy(String fullName, int powerMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, powerMagic,transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
