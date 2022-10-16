public class Main {
    public static void main(String[] args) {

        int savings = 15_000;
        int goal = 12_000_000;
        float interestRate = 0.07f;
        int month = 0;
        while (savings < goal) {
            month++;
            savings += savings * interestRate;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
}}}