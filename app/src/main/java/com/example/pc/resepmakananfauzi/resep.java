package com.example.pc.resepmakananfauzi;

/**
 * Created by PC on 10/11/2017.
 */

public class resep {
    private String judul, info, perintah;
    int citra;
    public resep (String s, int rendang,String lezat){


    }

    public resep(String judul, int citra, String info, String perintah) {
        this.judul = judul;
        this.info = info;
        this.perintah = perintah;
        this.citra = citra;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        info = info;
    }

    public String getPerintah() {
        return perintah;
    }

    public void setPerintah(String perintah) {
        perintah = perintah;
    }

    public int getCitra() {
        return citra;
    }

    public void setCitra(int citra) {
        citra = citra;
    }


}
