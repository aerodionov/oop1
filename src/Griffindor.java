public class Griffindor extends Hogwarts{
    private int nobility; //благородство
    private int honor;    //честь
    private int bravery;  //храбрость

    public void printStudentInfo() {
        System.out.println( "Имя и Фамилия: " + this.getFullName() +
                            ", Сила магии: " + this.getPowerMagic() +
                            ", Дальность трансгрессии: " + this.getTransgressionDistance() +
                            ", Благородство: " + this.nobility +
                            ", Честь: " + this.honor  +
                            ", Храбрость: " + this.bravery );
    }

    //конструктор
    public Griffindor(String fullName, int powerMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, powerMagic,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    //геттеры и сеттеры
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
