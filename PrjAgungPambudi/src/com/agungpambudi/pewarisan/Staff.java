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
 * @author Agung Pambudi
 */
public class Staff extends Pegawai {

    public Staff() {
    }

    @Override
    public void getDetail() {
        DecimalFormat gajibersih = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        gajibersih.setDecimalFormatSymbols(formatRp);

        System.out.println("Nama Staff           : " + super.getNama());
        System.out.println("Golongan             : " + super.getGolongan());
        System.out.println("Gaji Bersih          : Rp. " + gajibersih.format(super.getSalary()));
        System.out.println("Jabatan              : Staff");
    }
}
