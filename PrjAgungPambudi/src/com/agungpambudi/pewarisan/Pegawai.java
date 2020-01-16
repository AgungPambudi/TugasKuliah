/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agungpambudi.pewarisan;

/**
 *
 * * Dibuat oleh : KELOMPOK 
   
        18311243-ADELIA RAHMAWATI
  	18311009-ANNISA ISTIQOMAH
        18311052-AGUNG PAMBUDI

 */
public abstract class Pegawai extends Perusahaan {

    private String nama;
    private char golongan;
    private int jamKerja;
    private final Gaji salary;

    public Pegawai() {
        salary = new Gaji();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getGolongan() {
        return golongan;
    }

    public void setGolongan(char golongan) {
        this.golongan = golongan;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getSalary() {

        switch (golongan) {
            case 'A':
                salary.setGajiPokok(3000000);
                break;

            case 'B':
                salary.setGajiPokok(2000000);
                break;

            default:
                salary.setGajiPokok(1000000);
                break;
        }

        if (jamKerja > 8) {
            int jam_lembur = jamKerja - 8;
            salary.setUangLembur(jam_lembur * 30000);
        } else {
            salary.setUangLembur(0);
        }
        return salary.getGajiBersih();

    }

    public abstract void getDetail();
}
