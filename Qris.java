import java.util.Scanner;

public class Qris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, harga;
        double diskon, totalBayar;
        String member, pembayaran;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan Angka Dari Menu Yang Anda Pilih: ");
        menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah Punya Member (Y/N): ");
        member = sc.nextLine();
        System.out.println("Metode Pembayaran: Qris/Cash): ");
        pembayaran = sc.nextLine();
        System.out.println("------------------------------------------");

        if (member.equalsIgnoreCase("Y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling: " + harga);
            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            if (pembayaran.equalsIgnoreCase("Qris")) {
                harga -= 1000;
                System.out.println("Potongan Qris: 1000");
            }
            totalBayar = harga - (harga * diskon);
            System.out.println("Total Bayar Setelah Diskon: " + totalBayar);

        } else if (member.equalsIgnoreCase("N")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling: " + harga);
            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            if (pembayaran.equalsIgnoreCase("Qris")) {
                harga -= 1000;
                System.out.println("Potongan Qris: 1000");
            }
            System.out.println("Harga Bayar: " + harga);

        } else {
            System.out.println("Member Tidak Valid");
        }
        System.out.println("------------------------------------------");
    }
}
