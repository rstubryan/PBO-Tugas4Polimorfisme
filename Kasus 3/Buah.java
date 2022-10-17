/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author Restu
 */
public class Buah {
    int banyak;
    String nama;

    public Buah(int banyak, String nama) {
        this.banyak = banyak;
        this.nama = nama;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBanyak() {
        return banyak;
    }

    public String getNama() {
        return nama;
    }
    
    public void eat(){
        System.out.println("eating...");
    }
}
