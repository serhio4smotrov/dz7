public class zad3 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTime = calculateDay(deliveryDistance);
        System.out.println("Потребуется дней: "+deliveryTime);
    }

    public static int calculateDay(int d) {
        int t;
        if (d < 20) {
            t = 1;
        } else {
            t = (d + 20) / 40 +1;
        }
        return t;
    }
}
