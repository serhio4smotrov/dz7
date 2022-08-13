public class zad4 {
    public static void main(String[] args) {
        String a = "abbccdefgghiijjkk";
        searchDuple(a);
    }
    public static void searchDuple(String a){
        for (int i = 0;i < a.length()-1;i++) {
            char b = a.charAt(i);
            char c = a.charAt(i+1);
            if (b == c) {
                System.out.println("символ "+b+" повторяется");
                break;
            }
        }
    }
}
