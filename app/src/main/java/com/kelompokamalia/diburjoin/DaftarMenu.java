package com.kelompokamalia.diburjoin;

import java.util.ArrayList;

/**
 * Created by acer-pc on 6/11/2015.
 */

public class DaftarMenu {
    public String idMakanan;
    public String namaMakanan;
    public String hargaMakanan;
    public String deskripsiMakanan;

    public DaftarMenu(String idMakanan, String namaMakanan, String hargaMakanan, String deskripsiMakanan) {
        this.idMakanan = idMakanan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
    }

    public static ArrayList<DaftarMenu> getDaftarMenus() {
        ArrayList<DaftarMenu> DaftarMenus = new ArrayList<DaftarMenu>();

        return DaftarMenus;
    }
}