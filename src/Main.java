public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + money;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }
        int a = 10;
        for (a = 10; a <= 10 && a >= 1; a = a - 1) {
            System.out.print(a + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int bornPeople = 17;
        int diedPeople = 8;
        int aNumber = 1000;
        int i = 0;
        for (i = 0; i <= 10; i = i + 1) {
            totalPeople = (totalPeople + ((totalPeople / aNumber) * (bornPeople - diedPeople)));
            System.out.println("Год " + i + " численность населения составляет " + totalPeople);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int i = 2;
        int total = 0;
        int money = 15000;
        for (total = 0, i = 2; total <= 12_000_000; i = i + 1) {
            money = money + ((money / 100) * 7);
            total = total + money;
            System.out.println("Месяц " + i + " денег " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int i = 2;
        int total = 0;
        int money = 15000;
        for (total = 0, i = 2; total <= 12_000_000; i = i + 1) {
            money = money + ((money / 100) * 7);
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накоплено " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int i = 2;
        int total = 0;
        int money = 15000;
        int year = 9;
        int oneYearMonths = 12;
        {
            System.out.println("Василий хочет копить 9 лет, в каждом годе 12 месяцев, соответсвенно в 9 годах 9*12 месяцев, то есть " + (year * oneYearMonths));
        }
        for (total = 0, i = 2; i <= (year * oneYearMonths); i = i + 1) {
            money = money + ((money / 100) * 7);
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накоплено " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 3;
        int totalDays = 31;
        for (i = 3; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int i = 1896;
        int a = i + 200;
        for (i = 1896; i <= a; i = i + 79) {
            System.out.println("Комета пролетит в  " + i + " году");
        }

    }
}
