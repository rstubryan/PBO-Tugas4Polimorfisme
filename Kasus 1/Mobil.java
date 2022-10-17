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
public class Mobil {
    int kecepatan;
    String x;

    public Mobil(int kecepatan, String x) {
        this.kecepatan = kecepatan;
        this.x = x;
    }
    
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getX() {
        return x;
    }
    
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle();
       vehicle.run();
       vehicle.run(100);
       vehicle.run("fast");
    }
}

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }

    public void run(int speed) {
        System.out.println("Vehicle is running at " + speed + " km/h");
    }

    public void run (String speed) {
        System.out.println("Vehicle is running " + speed);
    }
}