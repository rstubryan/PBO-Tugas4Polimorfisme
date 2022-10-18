/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author Restu
 */
class Bel {
    public void suara(){
        System.out.println("TEEEEEEEEEEEETTTTTTTTTTTT");
    }
}

class Sepeda extends Bel {
    @Override
    public void suara(){
        System.out.println("Kring kring");
    }
}

public class Suara {
    public static void main(String [] args){
        Bel sepeda = new Sepeda();
        sepeda.suara();
    }
}
