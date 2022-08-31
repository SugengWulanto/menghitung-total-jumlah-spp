package tugas3;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("Masukan nama sekolah");
        Scanner input1 = new Scanner(System.in);
        String namaSklh = input1.nextLine();
        System.out.println("Masukan jumlah spp perbulan");
        Scanner input2 = new Scanner(System.in);
        int spp = input2.nextInt();
        System.out.println("Masukan jangka waktu sekolah");
        Scanner input3 = new Scanner(System.in);
        int jangkaWaktu = input3.nextInt();
        int total = spp * jangkaWaktu;
        Tugas3model tugas3model = new Tugas3model(namaSklh,spp,jangkaWaktu,total);
        System.out.println(tugas3model);
    }
}
