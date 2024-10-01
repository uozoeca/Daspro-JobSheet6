import java.util.Scanner;

public class Pemilihan2Percobaan310 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penghasilan, gajiBersih;
        double pajak = 0;
        String kategori;
        System.out.println("Masukkan Kategori: ");
        kategori = sc.nextLine();
        System.out.println("Masukkan Besar Penghasilan: ");
        penghasilan = sc.nextInt();
        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } else
            System.out.println("Kategori Salah");
    }
}
