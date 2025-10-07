package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       String option;
       String name;
       int age;
       Float weight;
       Float height;
    
       System.out.println("\n Benvingut al programa sobre el control de la salut general fisica");
       System.out.println("Sisplau escull l'opcio que vols utilitzar: ");
       System.out.println("a) Introduir les dades");
       System.out.println("b) Modificar les dades");
       System.out.println("c) Visualitzar les dades");
       System.out.println("");
        option = j.next();
        
        switch (option) {
            case "a": // Introduir dades
                j.nextLine(); // Neteja el buffer del next()

                System.out.println("\nSisplau introdueix el teu nom:");
                name = j.nextLine();

                if (name.trim().equals("")) {
                    System.out.println("Error: El nom no pot quedar buit!");
                } else {
                System.out.println("Sisplau introdueix la teva edat: ");
                age = j.nextInt();
                if (age >= 120)
                {
                    System.out.println("Error:");
                }
                System.out.println("Sisplau introdueix el teu pes: ");
                weight = j.nextFloat();
                System.out.println("Sisplau introdueix la teva alçada: ");
                height = j.nextFloat();             
                }
            case "b": //Modificar dades
            case "c": //Visualitzar dades
            default:
                break;
            
       } 
    }
}
    

