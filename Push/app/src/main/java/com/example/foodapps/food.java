package com.example.foodapps;

public class food {
    private String judul,ig,lokasi;
    private Integer gambar;

    public food(String judul, String ig, String lokasi, Integer gambar) {
        this.judul = judul;
        this.ig = ig;
        this.lokasi = lokasi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }
}
