/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agungpambudi.pewarisan;

/**
 *
 * @author 
 * Dibuat oleh : KELOMPOK 
   
        18311243-ADELIA RAHMAWATI
  	18311009-ANNISA ISTIQOMAH
        18311052-AGUNG PAMBUDI

 */
public class Gaji {

    private double gajiPokok;
    private double uangLembur;

    public double getGajiBersih() {
        return (gajiPokok + uangLembur);
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setUangLembur(double uangLembur) {
        this.uangLembur = uangLembur;
    }
}
