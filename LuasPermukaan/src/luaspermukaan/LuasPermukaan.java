/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luaspermukaan;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LuasPermukaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);

        boolean kembali = true;
        while (kembali) {
            System.out.println("1. Menghitung luas dan keliling persegi panjang");
            System.out.println("2. Menghitung volume dan luas permukaan balok");
            System.out.println("3. Menghitung volume dan luas permukaan tabung");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                    break;
                case 2:
                    System.out.print("Masukkan panjang: ");
                    panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    lebar = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiBalok = scanner.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggiBalok);
                    System.out.println("Volume balok: " + balok.hitungVolume());
                    System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiTabung = scanner.nextDouble();
                    Tabung tabung = new Tabung(jariJari, tinggiTabung);
                    System.out.println("Volume tabung: " + tabung.hitungVolume());
                    System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());
                    break;
                case 4:
                    kembali = false;
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}