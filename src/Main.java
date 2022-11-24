public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 1");
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Homework 2");
        System.out.println("Task 1");
        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }
        System.out.println();
        System.out.println("Task 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        System.out.print("1 ");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Homework 3");
        System.out.println("Task 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();
        System.out.println("Task 2");
        int totalWithPersent = 0;
        for (int i = 1; i <= 12; i++) {

            totalWithPersent = totalWithPersent + salary;
            totalWithPersent = totalWithPersent + totalWithPersent/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalWithPersent + " рублей.");
        }
    }
}