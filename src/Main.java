

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1.1 ");
        int savings = 15000;
        int total2 = 0;
        for (int i = 1; total2 < 2459000; i++) {
            total2 = total2 + savings;

            System.out.println("Месяц " + i + " Итого " + total2);
        }

        System.out.println(total2);


        System.out.println(" Задание 1.2 ");
        int z = 0;
        while (z < 10) {
            z++;
            System.out.print(" " + z);
        }
        System.out.println(" ");
        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j);
        }
        System.out.println();

            System.out.println(" Задание 1.3 ");

        int allPeople = 12_000_000;
        double deathRatio = (double) 8 / 1000;
        double birthRatio = (double) 17 / 1000;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            allPeople = (int) (allPeople + allPeople * birthRatio - allPeople * deathRatio);


            System.out.println("Год " + year + " Итого " + allPeople);

            System.out.println(allPeople);
        }

        System.out.println(" Задание 1.4 ");

        double salary3 = 15000;

        double percent = (double) 7 / 100;

        int allPrise = 12_000_000;

        for (int month = 1; salary3 <allPrise; month++) {

            salary3 =salary3 + salary3 * percent;

            System.out.println("Месяц " + month + " Итого " + salary3);

            System.out.println(salary3);
        }
        
        
            System.out.println(" Задание 1.5 ");

        double salary4 = 15000;

        double percent4 = (double) 7 / 100;

        int allPrise4 = 12_000_000;

        int month4 = 1;

        for (; salary4 <allPrise4; month4++) {

            salary4 = salary4 + salary4 * percent4;
            if (month4 % 6 == 0) {

                System.out.println("Месяц " + month4 + " Итого " + salary4);
            }
        }

            System.out.println(salary4);


            System.out.println(" Задание 1.6 ");
        double salary5 = 15000;

        double percent5 = (double) 7 / 100;

        int month5 = 1;

        for (; month5 <108; month5++) {

            salary5 = salary5 + salary5 * percent5;
            if (month5 % 6 == 0) {

                System.out.println("Месяц " + month5 + " Итого " + salary5);
            }
        }

        System.out.println(salary5);

            System.out.println(" Задание 1.7 ");

            for (int friday = 1; friday <= 31; friday+=7) {

                    System.out.println("Сегодня пятница " +friday + " число");

            }
            System.out.println(" Задание 1.8 ");

        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
            }


        }
    }



