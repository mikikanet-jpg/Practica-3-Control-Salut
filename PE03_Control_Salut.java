package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       String option;
       String name;
       int age;
    
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
                        System.out.println("Error: L'edat ha de ser un enter positiu <=120");
                    } else {
                        System.out.println("Sisplau introdueix el teu pes: ");
                        // llegim com a text per poder substituir la coma per punt
                        String pesText = j.next();

                        // canviem la coma per un punt (així Java el pot convertir a float)
                        pesText = pesText.replace(",", ".");

                        // convertim a float
                        float weight = Float.parseFloat(pesText);
                        if (weight <= 0 || weight > 400) {
                            System.out.println("Error: El pes ha de ser un decimal positiu raonable.");
                        } else {
                                System.out.println("Sisplau introdueix la teva alçada: ");   
                                try {
                                float height = j.nextFloat();

                                if (height < 0.5 || height > 2.5) {
                                    System.out.println("Error: L'alçada ha de ser un decimal positiu entre 0.5 i 2.5 metres.");
                                } else {}
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Format numèric invàlid.");
                                }        
                        }
                    }
                }
            case "b": //Modificar dades
            case "c": //Visualitzar dades
            default:
                break;
            
       } 
    }
}
    

