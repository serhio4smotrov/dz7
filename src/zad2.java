import java.time.LocalDate;

public class zad2 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        checkVersionInst(clientOS, currentYear);
    }

    public static void checkVersionInst(int i, int b) {
        if (b < 2015) {
            if (i == 0) {
                System.out.println("���������� ����������� ������ ���������� ��� iOS");
            }
            if (i == 1) {
                System.out.println("���������� ����������� ������ ���������� ��� Android");
            }
        } else {
            if (i == 0) {
                System.out.println("���������� ������ ���������� ��� iOS");
            }
            if (i == 1) {
                System.out.println("���������� ������ ���������� ��� Android");
            }
        }
    }
}
