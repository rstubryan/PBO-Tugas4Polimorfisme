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
class Bus {
      String carName;
      int numberOfSeats;
      Bus(String name,int seats){
            carName=name;
            numberOfSeats=seats;
            System.out.println("\n===================================");
            System.out.println("Nama bus : "+carName);
            System.out.println("Banyak kursi : "+numberOfSeats);
            System.out.println("===================================");
      }
      //overloading
      void moveFast(){
            System.out.println("Bus bergerak dengan kecepatan 50Km/j");
      }
      void moveFast(int speed){
            System.out.println("Bus bergerak dengan kecepatan "+ speed +"Km/j");
      }
      //overriding
      void engineCapacity(){
            System.out.println("CC mesin bus : 7500cc");
      }
}

class Scania extends Bus{
      String modelNumber;
      Scania(String name,int seats,String modelNum){
            super(name,seats);
            modelNumber=modelNum;
      }
      void displayModel(){
            System.out.println("Nomer model bus : "+modelNumber);
      }
      
      //overriding
      @Override
      void engineCapacity(){
            System.out.println("Kapasitas CC mesin Scania : 8000cc");
      }
}

class Benz extends Bus{
      String modelNumber;
      Benz(String name,int seats,String modelNum){
            super(name,seats);
            modelNumber=modelNum;
      }
      void displayModel(){
            System.out.println("Nomer model bus : "+modelNumber);
      }
      //overriding
      void engineCapacity(){
            System.out.println("Kapasitas CC mesin Scania : 2500cc");
      }
}

class MainClass{
      public static void main(String args[]){
            //inheritance
            Scania sca=new Scania("Bus Scania",40,"T100");
            Benz bz=new Benz("Bus Benz",50,"G300");
            sca.displayModel();
            bz.displayModel();
            
            //overloading
            sca.moveFast();
            sca.moveFast(125);
            //overriding
            Bus sc=new Scania("Scania Bus overridden",40,"T100");
            Bus ben=new Benz("Benz Bus overridden",50,"G300");
            sc.engineCapacity();
            ben.engineCapacity();
      }
}
