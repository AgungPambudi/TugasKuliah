/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agungpambudi.main;

import com.agungpambudi.pewarisan.Manager;
import com.agungpambudi.pewarisan.Staff;
import java.util.Scanner;

/**
 *
  Dibuat oleh : KELOMPOK 
   
        18311243-ADELIA RAHMAWATI
  	18311009-ANNISA ISTIQOMAH
        18311052-AGUNG PAMBUDI
 */
public class MainClass {

    public static void main(String[] args) {

        int jml_staf;

        Scanner input = new Scanner(System.in);

        Manager manager = new Manager();
        Staff staff = new Staff();

        System.out.print("Nama Perusahaan        : ");
        manager.setNamaPerusahaan(input.nextLine());

        System.out.print("Alamat Perusahaan      : ");
        manager.setAlamat(input.nextLine());

        System.out.print("Nama Department        : ");
        manager.setDepartemen(input.nextLine());

        System.out.print("Nama Manager           : ");
        manager.setNama(input.nextLine());

        System.out.print("Jenis Golongan [A/B/C] : ");
        manager.setGolongan(input.next().charAt(0));

        System.out.print("Jam Kerja              : ");
        manager.setJamKerja(input.nextInt());

        System.out.print("Jumlah Staf            : ");
        jml_staf = input.nextInt();

        for (int i = 0; i < jml_staf; i++) {
            System.out.print("\nNama Pegawai           : ");
            staff.setNama(input.next());

            System.out.print("Jenis Golongan [A/B/C] : ");
            staff.setGolongan(input.next().charAt(0));

            System.out.print("Jam Kerja              : ");
            staff.setJamKerja(input.nextInt());

            manager.addStaf(staff);
        }

        System.out.println("\n=========================== OUTPUT =========================== \n");

        manager.getDetail();

    }
}
