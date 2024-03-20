package edu.uph.duasatusi.udaraku;

import io.realm.RealmObject;

public class model extends RealmObject{
    //atribut 1
    private String namaLengkap;
    private int nomorTelepon;
    private String namaKota;
    private int kodePos;
    private String alamat;
    private String emailBaru;
    private String passwordBaru;
    private String konfirmasiPassword;

    public profil(String namaLengkap, int nomorTelepon, String namaKota, int kodePos, String alamat, String emailBaru, String konfirmasiPassword) {
        this.namaLengkap = namaLengkap;
        this.nomorTelepon = nomorTelepon;
        this.namaKota = namaKota;
        this.kodePos = kodePos;
        this.alamat = alamat;
        this.emailBaru = emailBaru;
        this.passwordBaru = passwordBaru;
        this.konfirmasiPassword = konfirmasiPassword;
    }

    //atribut 2
    private String lokasi;
    private int jarak;
    private Date waktu;

    public weather(String lokasi, int jarak, Date waktu){
        this.lokasi = lokasi;
        this.jarak = jarak;
        this.waktu = waktu;
    }

    //atribut 3
    private String namaAlamat;
    private String namaTempat;
    private String kecamatan;
    private String kota;

    public lokasi(String namaAlamat, String namaTempat, String kecamatan, String kota){
        this.namaAlamat = namaAlamat;
        this.namaTempat = namaTempat;
        this.kecamatan = kecamatan;
        this.kota = kota;
    }

    //atribut 4
    private String namaFitur;
    private String deskripsi;
    private String tingkatKesulitan;
    private String gambar;
    private String instruksi;

    public pembelajaran(String namaFitur, String deskripsi, String tingkatKesulitan, String gambar, String instruksi) {
        this.namaFitur = namaFitur;
        this.deskripsi = deskripsi;
        this.tingkatKesulitan = tingkatKesulitan;
        this.gambar = gambar;
        this.instruksi = instruksi;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getGambarProduk() {
        return gambarProduk;
    }

    public void setGambarProduk(int gambarProduk) {
        this.gambarProduk = gambarProduk;
    }
}
