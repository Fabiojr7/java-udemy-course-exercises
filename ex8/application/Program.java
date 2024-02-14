package ex8.application;

import java.util.Locale;
import java.util.Scanner;

import ex8.entities.Rent;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] vect = new Rent[10]; 

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Rent #"+ (i+1) +":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");

        for(int i=0; i<10; i++){
            if(vect[i] != null){
                System.out.println(i+": "+vect[i]);
            }
        }

        sc.close();
    }
}
