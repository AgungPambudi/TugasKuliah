/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agungpambudi.pewarisan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * * Dibuat oleh : KELOMPOK 
   
        18311243-ADELIA RAHMAWATI
  	18311009-ANNISA ISTIQOMAH
        18311052-AGUNG PAMBUDI
 */
public class Manager extends Pegawai {

    private String departemen;
    private Staff[] staf = new Staff[20];
    private int jml_staff = 0;

    public Manager() {
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void addStaf(Staff st) {
        this.staf[jml_staff] = st;
        this.jml_staff++;
    }

    @Override
    public void getDetail() {
        DecimalFormat gajibersih = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        gajibersih.setDecimalFormatSymbols(formatRp);

        System.out.println("Nama Perusahaan      : " + super.getNamaPerusahaan());
        System.out.println("Alamat Perusahaan    : " + super.getAlamat() + "\n");

        System.out.println("Nama Department      : " + departemen);
        System.out.println("Nama Manager         : " + super.getNama());
        System.out.println("Golongan             : " + super.getGolongan());
        System.out.println("Gaji Bersih          : " + gajibersih.format(super.getSalary()));
        System.out.println("Jabatan              : Manager");

        System.out.println("\nList Staff           : ");

        System.out.println("No. \tNama \tGol \tGajiBersih");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < jml_staff; i++) {
            System.out.print((i + 1) + ". ");
            System.out.print("\t" + staf[i].getNama());
            System.out.print("\t" + staf[i].getGolongan());
            System.out.print("\t" + gajibersih.format(staf[i].getSalary()));
            System.out.println();
        }

    }

}
