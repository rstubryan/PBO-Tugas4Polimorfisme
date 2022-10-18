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
public class Buaya extends Hewan {

    //overriding
    @Override
    public void makan() {
        System.out.println("Buaya makan daging");
    }
    
    //overloading
	public void makan(String s) {
            System.out.println("Buaya makan " + s);
	}

	public static void main(String[] args) {
		Buaya satu = new Buaya();
		satu.makan();

		Buaya dua = new Buaya();
		dua.makan("manusia");

		Buaya tiga = new Buaya();
		tiga.makan("omongan sendiri");

		Buaya empat = new Buaya();
		empat.makan("temen");

		Buaya lima = new Buaya();
	}
}
