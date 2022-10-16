public class Main {
    public static void main(String[] args) {

        int year = 0;
        int periodCometPassage = 79;
        int nowYear = 2022;
        int last200Years = nowYear - 200;
        int next100Years = nowYear + 100;
        while (year < next100Years) {
            if (year > last200Years) {
                System.out.println(year);
            }
            year += periodCometPassage;
        }


}}