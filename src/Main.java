public class Main {
    public static void main(String[] args) {

        // task1
        for (int i = 0; i <=10; i++) {
            System.out.println("Число " + i);
        }
        // task2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
        //task3
        for (int i = 0; i <=17; i = i + 2) {
            System.out.println("Четное чило " + i);
        }
        //task4
        for (int i = 10; i >= -10; i--) {
            System.out.println("число от большего к меньшему " + i);
        }
        //task5
        for (int i = 1904; i <=2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        //task6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task8
        int many = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + many;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        //task 9
        int rubles = 29000;
        int month = 0;
        for (int i = 1; i <= 12; i++) {
            month = month + month/100;
            month = month + rubles;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month + " рублей.");
        }
        //task10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}