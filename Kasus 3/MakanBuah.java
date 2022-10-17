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
public class MakanBuah extends Buah{
    
    public MakanBuah(int banyak, String nama) {
        super(banyak, nama);
    }
    
    @Override
    public void eat(){
        System.out.println("Makan bang");
    }
    
    public static void main(String[] args) {
        
    }
}
