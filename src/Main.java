public class Main {
    public static void main(String[] args) {
        int salary = 15_000;
        int total = 0;
        int month = 0;
        int goal = 2_459_000;
        while (total <= goal) {
            month++;
            total += salary + total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

}}