public class Main {
    public static void main(String[] args) {

        int savings = 15_000;
        float interestRate = 0.07f;
        for (int i = 1; i <= 108; i++) {
            savings += savings * interestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
}}}}