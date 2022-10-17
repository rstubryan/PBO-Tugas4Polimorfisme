package Kasus1;

public class Test1 {   
	public static void main(String[] args) {
		Hewan hewan1 = new Kucing();
                System.out.println("Suara hewan apa ini?");
		System.out.println(hewan1.suara());

		Hewan hewan2 = new Anjing();
                System.out.println("\nSuara hewan apa ini?");
		System.out.println(hewan2.suara());
                System.out.println(hewan2.gigit());
	}    
}