public class Main {
    public static void printStudentInfo(Griffindor student) {
        student.printStudentInfo();
    }
    public static void printStudentInfo(Puffenduy student) {
        student.printStudentInfo();
    }
    public static void printStudentInfo(Kogtevran student) {
        student.printStudentInfo();
    }
    public static void printStudentInfo(Sliserin student) {
        student.printStudentInfo();
    }

    //метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if ((student1.getPowerMagic() + student1.getTransgressionDistance()) == (student2.getPowerMagic() + student2.getTransgressionDistance())) {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + "равны по силе");
        } else if ((student1.getPowerMagic() + student1.getTransgressionDistance()) > (student2.getPowerMagic() + student2.getTransgressionDistance())) {
            System.out.println(student1.getFullName() + " сильнее чем " + student2.getFullName());
        } else {
            System.out.println(student1.getFullName() + " слабее чем " + student2.getFullName());
        }
    }

    public static void compareGriffindorStudents(Griffindor student1, Griffindor student2) {
        int student1Summ = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int student2Summ = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (student1Summ == student2Summ) {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + "равные по силе Гриффиндорцы");
        } else if (student1Summ > student2Summ) {
            System.out.println(student1.getFullName() + " более сильный Гриффиндорец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " более сильный Гриффиндорец чем " + student1.getFullName());
        }
    }
    public static void comparePuffenduyStudents(Puffenduy student1, Puffenduy student2) {
        int student1Summ = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int student2Summ = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (student1Summ == student2Summ) {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + "равные по силе Пуффендуйцы");
        } else if (student1Summ > student2Summ) {
            System.out.println(student1.getFullName() + " более сильный Пуффендуец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " более сильный Пуффендуец чем " + student1.getFullName());
        }
    }
    public static void compareKogtevranStudents(Kogtevran student1, Kogtevran student2) {
        int student1Summ = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int student2Summ = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (student1Summ == student2Summ) {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + "равные по силе Когтевранцы");
        } else if (student1Summ > student2Summ) {
            System.out.println(student1.getFullName() + " более сильный Когтевранец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " более сильный Когтевранец чем " + student1.getFullName());
        }
    }
    public static void compareSliserinStudents(Sliserin student1, Sliserin student2) {
        int student1Summ = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getIngenuity() + student1.getInfluence();
        int student2Summ = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getIngenuity() + student2.getInfluence();
        if (student1Summ == student2Summ) {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + "равные по силе Слизеринцы");
        } else if (student1Summ > student2Summ) {
            System.out.println(student1.getFullName() + " более сильный Слизеринец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " более сильный Слизеринец чем " + student1.getFullName());
        }
    }
    public static void main(String[] args) {
        Griffindor garryP = new Griffindor("Гарри Поттер", 60,5,23,6,4);
        Griffindor germionaG = new Griffindor("Гермиона Грейнджер", 50,5,12,5,4);
        Griffindor rhonU = new Griffindor("Рон Уизли", 30,7,2,6,4);

        Sliserin drakoM = new Sliserin("Драко Малфой", 46,6,5,4,3,9,9);
        Sliserin grehemM = new Sliserin("Грэхэм Монтегю", 40,4,4,6,2,5,7);
        Sliserin gregoryG = new Sliserin("Грегори Гойл", 20,7,5,2,3,7,5);

        Puffenduy zahariaS = new Puffenduy("Захария Смит", 55,4,5,3,7);
        Puffenduy sedricD = new Puffenduy("Седрик Диггори", 53,4,5,3,7);
        Puffenduy dzhastinF = new Puffenduy("Джастин Финч-Флетчли", 58,4,5,3,7);

        Kogtevran chzhouC = new Kogtevran("Чжоу Чанг", 53,5,4,5,4,3);
        Kogtevran padmaP = new Kogtevran("Падма Патил", 48,5,3,5,4,3);
        Kogtevran markusB = new Kogtevran("Маркус Белби", 60,5,4,3,6,7);


        printStudentInfo(garryP);
        printStudentInfo(germionaG);
        printStudentInfo(drakoM);
        printStudentInfo(grehemM);
        compareStudents(drakoM,germionaG);
        compareGriffindorStudents(garryP,germionaG);
        compareKogtevranStudents(padmaP,chzhouC);


    }
}