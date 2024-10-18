public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte car = 8;
        System.out.println("Значение переменной byte с типом car равно " + car);
        short banan = 15;
        System.out.println("Значение переменной short с типом banan равно " + banan);
        int tree = 100000;
        System.out.println("Значение переменной int с типом tree равно " + tree);
        long rezidents = 50000000000000L;
        System.out.println("Значение переменной long с типом rezidents равно " + rezidents);
        float temperature = 15.4f;
        System.out.println("Значение переменной float с типом temperature равно " + temperature);
        double milligrams = 205.89;
        System.out.println("Значение переменной double с типом milligrams равно " + milligrams);

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 596;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte studentsA = 27;
        byte studentsL = 23;
        byte studentsE = 30;
        int totalStudents = studentsA + studentsL + studentsE;
        short totalPapers = 480;
        int papersStudent = totalPapers / totalStudents;
        System.out.println("На каждого ученика расчитано " + papersStudent + " листов бумаги");

        int bottlesInTwoMinute = 16;
        int bottlesInMinute = bottlesInTwoMinute / 2;
        int hour = 60;
        int day = hour * 24;
        int bottlesIn20Minutes = bottlesInMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        int bottlesPerDay = day * bottlesInMinute;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlersInThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlersInThreeDays + " штук бутылок");
        int bottlerPerMonth = 30 * bottlesPerDay;
        System.out.println("За месяц машина произвела " + bottlerPerMonth + " штук бутылок");

        int totalCansOfPaint = 120;
        int oneClassOfBrownPaint = 4;
        int oneClassOfWhitePaint = 2;
        int Class = totalCansOfPaint / (oneClassOfWhitePaint + oneClassOfBrownPaint);
        int whitePaint = Class * oneClassOfWhitePaint;
        int brownPaint = Class * oneClassOfBrownPaint;
        System.out.println("В школе, где " + Class + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        int banana = 5;
        int WeightOfOneBanana = 80;
        int bananaWeight = banana * WeightOfOneBanana;
        int milk100ML = 105;
        int milk100MLServings = 2;
        int milkWeight = milk100ML * milk100MLServings;
        int iceCream = 100;
        int iceCreamServings = 2;
        int iceCreamWeight = iceCream * iceCreamServings;
        int Weight1Egg = 70;
        int totalEgg = 4;
        int eggWeight = Weight1Egg * totalEgg;
        int breakfastWeightInGrams = (bananaWeight + milkWeight + iceCreamWeight + eggWeight);
        int kilograms = 1000;
        double breaktfastWeightInKilograms = breakfastWeightInGrams / kilograms;
        System.out.println("Вес спортзавтрака в граммах " + breakfastWeightInGrams);
        System.out.println("Вес спортзавтрака в килограммах " + breaktfastWeightInKilograms);

        int overweight = 7000;
        int weightLossPerDay1 = 250;
        int weightLossPerDay2 = 500;
        int days1 = overweight / weightLossPerDay1;
        int days2 = overweight / weightLossPerDay2;
        int days3 = (days1 + days2) / 2;
        System.out.println("При потере веса на 250 граммов в день спортсмен потеряет " + days1 + " кг.,при потере веса на 500 граммов в день спортсмен потеряет " + days2 + " кг., в среднем спортсмен потеряет " + days3 + " кг.");

        int moneyM1 = 67760;
        int moneyD1 = 83690;
        int moneyK1 = 76230;
        double increase = 0.1;
        double moneyM2 = moneyM1 * increase;
        double moneyD2 = moneyD1 * increase;
        double moneyK2 = moneyK1 * increase;
        double moneyM3 = moneyM1 + moneyM2;
        double moneyD3 = moneyD1 + moneyD2;
        double moneyK3 = moneyK1 + moneyK2;
        int year = 12;
        double increaseMoneyMPerYear = moneyM2 * year;
        double increaseMoneyDPerYear = moneyD2 * year;
        double increaseMoneyKPerYear = moneyK2 * year;
        System.out.println("Маша теперь получает " + moneyM3 + " рублей. Годовой доход вырос на " + increaseMoneyMPerYear + " рублей");
        System.out.println("Денис теперь получает " + moneyD3 + " рублей. Годовой доход вырос на " + increaseMoneyDPerYear + " рублей");
        System.out.println("Кристина теперь получает " + moneyK3 + " рублей. Годовой доход вырос на " + increaseMoneyKPerYear + " рублей");
    }
}