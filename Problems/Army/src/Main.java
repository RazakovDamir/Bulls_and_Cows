class Army {

    public static void createArmy() {
        Unit unit = new Unit("un");
        unit.nameUnit = "un1";

        Unit unit1 = new Unit("un1");
        unit1.nameUnit = "un2";

        Unit unit2 = new Unit("un2");
        unit2.nameUnit = "un2";

        Unit unit3 = new Unit("un3");
        unit3.nameUnit = "un3";

        Unit unit4 = new Unit("un4");
        unit4.nameUnit = "un4";

        Knight k1 = new Knight("k1");
        k1.nameKnight = "k1";

        Knight k2 = new Knight("k2");
        k2.nameKnight = "k2";

        Knight k3 = new Knight("k3");
        k3.nameKnight = "k3";

        General ivan = new General("Ivan");
        ivan.nameGeneral = "Ivan";

        Doctor doc = new Doctor("DOC");
        doc.nameDoctor = "DOC";

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}