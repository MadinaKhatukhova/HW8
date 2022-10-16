public class Main {
    public static void main(String[] args) {

        int countryPopulation = 12_000_000;
        int birthRate;
        int mortalityRate;
        for (int i = 1; i < 11; i++) {
            birthRate = 17 * countryPopulation / 1000;
            mortalityRate = 8 * countryPopulation / 1000;
            countryPopulation += birthRate - mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);

}}}