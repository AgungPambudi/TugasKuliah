/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI18FX_ADELIARAHMAWATI_2;

import java.util.Scanner;

/**
 *
 * @author Adelia
 */
public class KelasUtama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();

        System.out.print("Nama Perusahaan        : ");
        pegawai.setNamaPerusahaan(input.nextLine());

        System.out.print("Alamat Perusahaan      : ");
        pegawai.setAlamat(input.nextLine());

        System.out.print("Nama Pegawai           : ");
        pegawai.setNama(input.next());

        System.out.print("Jenis Golongan [A/B/C] : ");
        pegawai.setGolongan(input.next().charAt(0));

        System.out.print("Jam Kerja              : ");
        pegawai.setJamKerja(input.nextInt());

        System.out.println("\n=========================== HASIL =========================== \n");

        pegawai.getDetail();
    }
}
