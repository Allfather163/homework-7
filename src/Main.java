public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 2 ");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 3 ");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" Четные числа  " + i);
        }

        System.out.println(" Задание 4 ");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 5 ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }

        System.out.println(" Задание 6 ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println(" Задание 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println(" Задание 8 ");
        int total = 0;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);


        System.out.println(" Задание 9 ");
        int salary1 = 29000;
        double total1 = 0;
        int salaryWithPenny = salary1 * 100;
        int totalWithPenny = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total1 = totalWithPenny / 100.;
            System.out.println("Месяц " + i + " Итого " + total1);
        }
        System.out.println(total1);


        System.out.println(" Задание 10 ");
        int namber = 2;
        for (int j = 1; j <= 10; j++) {
            System.out.println(namber + "*" + j + "=" + namber * j);

        }

        System.out.println(" Задание 1.1 ");
        int savings = 15000;
        int total2 = 0;
        while (total2 <= 2459000) {
            for (int i = 1; total2 <= 2459000; i++) {
                total2 = total2 + savings;

                System.out.println("Месяц " + i + " Итого " + total2);
            }
        }
        System.out.println(total2);

        System.out.println(" Задание 1.2 ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int a = 11;
        while (a > 1) {
            a = a - 1;
            System.out.print(a + " ");
        }
        System.out.println(" ");

        System.out.println(" Задание 1.3 ");

        int allPeople = 12_000_000;
        int death = allPeople / 1000 * 8;
        int birth = allPeople / 1000 * 17;
        int growth = allPeople / 1000 * 9;
        int y = growth + allPeople;
        for (int i = 1; i <= 10; i++) {
            y = y + growth;

            System.out.println("Год " + i + " Итого " + y);
        }
        System.out.println(y);

        System.out.println(" Задание 1.4 ");

        int salary3 = 15000;
        int total3 = 15000;
        int i = 0;
        for (; total3 <= 12_000_000; i++) {
            total3 = total3 + salary3/100*7;

            {
                System.out.println("Месяц " + i + " Итого " + total3);
            }
        }
        System.out.println(total3);

        System.out.println(" Задание 1.5 ");

        int salary4 = 15000;
        int total4 = 15000;
        int q = 0;
        for (; total4 <= 12_000_000; q++) {
            total4 = total4 + salary4/100*7;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + " Итого " + total4);
            }
        }
        System.out.println(total4);

        System.out.println(" Задание 1.6 ");

        int salary5 = 15000;
        int total5 = 15000;
        int k = 0;
        for (k = 1; k <= 108; k++) {
            total5 = total5 + salary5/100*7;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " Итого " + total5);
            }
        }
        System.out.println(total5);

        System.out.println(" Задание 1.7 ");

        for (int day=1; day<=31; day++){
            if(day%7 ==0){
                System.out.println("Сегодня пятница "+ day+ " число");
            }
        }
        System.out.println(" Задание 1.8 ");

        for (int c=0 ; c <=2123; c=c+73) {
            if (c >= 1825) {
                System.out.println(c);
            }
        }


        







    }
    }
