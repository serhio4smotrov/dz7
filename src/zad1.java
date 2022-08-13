public class zad1 {
    public static void main(String[] args) {
        int year = 2021;
        checkYear(year);
    }

    public static void checkYear(int i) {
        if (i%4 == 0 || i%100 == 0 && i%400 == 0) {
            System.out.println(i+" - высокосный год");
        } else {
            System.out.println(i+" - невысокосный год");
        }
    }
}
