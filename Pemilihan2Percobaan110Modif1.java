import java.util.Scanner;

public class Pemilihan2Percobaan110Modif1 {

    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Masukkan Tahun: ");
        int tahun = sc10.nextInt();
        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
