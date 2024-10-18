public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte car=8;
        System.out.println("Значение переменной byte с типом car равно " +car);
        short banan=15;
        System.out.println("Значение переменной short с типом banan равно "+banan);
        int tree=100000;
        System.out.println("Значение переменной int с типом tree равно "+tree);
        long rezidents=50000000000000L;
        System.out.println("Значение переменной long с типом rezidents равно "+rezidents);
        float temperature=15.4f;
        System.out.println("Значение переменной float с типом temperature равно "+temperature);
        double milligrams=205.89;
        System.out.println("Значение переменной double с типом milligrams равно "+milligrams);

        float a=27.12f;
        long b=987678965549L;
        double c=2.786;
        short d=596;
        short e=-159;
        short f=27897;
        byte g=67;

        byte studentsA=27;
        byte studentsL=23;
        byte studentsE=30;
        int totalStudents=studentsA+studentsL+studentsE;
        short totalPapers=480;
        int papersStudent=480/totalStudents;
        System.out.println("На каждого ученика расчитано "+papersStudent+" листов бумаги");

        int bottlesPerMinute=16/2;
        int hour=60;
        int day=hour*24;
        int bottlesIn20Minutes=bottlesPerMinute*20;
        System.out.println("За 20 минут машина произвела "+bottlesIn20Minutes+" штук бутылок");
        int bottlesPerDay=day*bottlesPerMinute;
        System.out.println("За сутки машина произвела "+bottlesPerDay+" штук бутылок");
        int bottlersInThreeDays=bottlesPerDay*3;
        System.out.println("За 3 дня машина произвела "+bottlersInThreeDays+" штук бутылок");
        int bottlerPerMonth=30*bottlesPerDay;
        System.out.println("За месяц машина произвела "+bottlerPerMonth+" штук бутылок");

        int totalCansOfPaint=120;
int oneClassPaint=totalCansOfPaint/6;
int whitePaint=oneClassPaint*2;
int brownPaint=oneClassPaint*4;
        System.out.println("В школе, где "+oneClassPaint+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");

short bananaWeight=5*80;
short milkWeight=105*2;
short iceCreamWeight=100*2;
short eggWeight=70*4;
int breakfastWeightInGrams=(bananaWeight+milkWeight+iceCreamWeight+eggWeight);
double breaktfastWeightInKilograms=breakfastWeightInGrams/1000;
System.out.println("Вес спортзавтрака в граммах "+breakfastWeightInGrams);
System.out.println("Вес спортзавтрака в килограммах "+breaktfastWeightInKilograms);










    }
}