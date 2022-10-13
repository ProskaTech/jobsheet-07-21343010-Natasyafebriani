/*
 created by 21343010-Natasya febriani
 */
package jobsheet7;

import java.util.Scanner;

public class Tugas1DoWhile {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;
        do {
            System.out.println(nama);
            jumlah++;
        } while (jumlah < 10);
    }
}