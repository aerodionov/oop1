public class Kogtevran extends Hogwarts{
    private int intelligence; //Ум
    private int wisdom;       //Мудрость
    private int wit;          //Остроумие
    private int creativity;   //Творчество

    public void printStudentInfo() {
        System.out.println( "Имя и Фамилия: " + this.getFullName() +
                ", Сила магии: " + this.getPowerMagic() +
                ", Дальность трансгрессии: " + this.getTransgressionDistance() +
                ", Ум: " + this.intelligence +
                ", Мудрость: " + this.wisdom  +
                ", Остроумие: " + this.wit  +
                ", Творчество: " + this.creativity );
    }

    public Kogtevran(String fullName, int powerMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(fullName, powerMagic,transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
