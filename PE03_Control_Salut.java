package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       // Variables inicialitzades perquè es puguin llegir abans o després
       String option;
       String name = " ";
       int age = 0;
       boolean sortida = false;
       float weight = 0.0f;
       String pesText = "";
       String heightText = "";
       Float height = 0.0f;
 
        while (!sortida) {
            System.out.println("\n Benvingut al programa sobre el control de la salut general fisica");
            System.out.println("Sisplau escull l'opcio que vols utilitzar: ");
            System.out.println("a) Introduir les dades");
            System.out.println("b) Modificar les dades");
            System.out.println("c) Visualitzar les dades");
            System.out.println("x) Sortir del programa");
            System.out.println("");                  
            option = j.next();
            
            switch (option) {
             case "a": // Introduir dades
                j.nextLine(); // Neteja el buffer del next()

                    // Introduir dades (llegim tot amb nextLine per evitar problemes de buffer)
                    System.out.println("Sisplau introdueix el teu nom complert:");
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
                            pesText = j.next().replace(",", ".");
                            weight = Float.parseFloat(pesText);
                            j.nextLine(); // neteja buffer
                            if (weight <= 0 || weight > 400) {
                                System.out.println("Error: El pes ha de ser un decimal positiu raonable.");
                            } else {
                                System.out.println("Sisplau introdueix la teva alçada: ");
                                try {
                                heightText = j.next().replace(",", ".");
                                height = Float.parseFloat(heightText);
                                j.nextLine(); // neteja buffer
                                    if (height < 0.5 || height > 2.5) {
                            System.out.println("Error: L'alçada ha de ser un decimal positiu entre 0.5 i 2.5 metres.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Format numèric invàlid.");
                        j.nextLine(); // neteja buffer
                    }
                        System.out.println("Dades introduides correctament!");
                
                                    }        
                            }
                        }
                        break;
                case "b": //Modificar dades
                    
                    j.nextLine(); //neteja de buffer
                   
                    System.out.println("--- Dades actuals ---");
                    System.out.println("Nom: " + name);
                    System.out.println("Edat: " + age);
                    System.out.println("Pes: " + weight + " kg");
                    System.out.println("Alçada: " + height + " m");
                    System.out.println("\nEscull quina dada vols modificar:");
                    System.out.println("1. Nom");
                    System.out.println("2. Edat");
                    System.out.println("3. Pes (kg)");
                    System.out.println("4. Alçada (m)");
                    int opcioMod = j.nextInt();
                    j.nextLine();
                    switch (opcioMod) {
                        case 1:
                            System.out.println("Nou nom: ");
                            name = j.nextLine();
                       break;
                        case 2: 
                            System.out.println("Nova edat");
                            age = j.nextInt();
                        break;
                        case 3:
                            System.out.println("Nou pes (kg):");
                            pesText = j.next().replace(",", ".");
                            weight = Float.parseFloat(pesText);
                            j.nextLine();
                        break;
                        case 4:
                            System.out.println(" Nova alçada (m)");
                            heightText = j.next().replace(",", ".");
                            height = Float.parseFloat(heightText);
                            j.nextLine();
                        break;
                    }
                    

                case "c": //Visualitzar dades
                    if (name.equals("") || age == 0 || weight == 0 || height == 0) {
                        System.out.println(" Primer has d'introduir totes les dades (opció a)");
                        break;
                    }

                    //Normalitzar nom (aqui m'ajudat el chatgpt)
                    name = name.trim();
                    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                    
                    //Calcula IMC
                    float imc = weight / (height * height);
                    String Categoria;
                    if (imc < 18.5) {
                        Categoria ="Pes baix";
                    } else if (imc < 25) {
                        Categoria = "Pes normal";
                    } else if (imc < 30) {
                        Categoria = "Sobrepès";
                    } else {
                        Categoria = "Obesitat";
                    }

                    //Freqüencia cardíaca màxima
                    int fcMax = 220 - age;
                    int fc50 = (int)(fcMax * 0.5);
                    int fc85 = (int)(fcMax * 0.85);

                    //Aigua recomenada (litres)
                    float litres = (weight * 35)/ 1000;

                    //Any de naixement
                    int anyNaix = 2025 - age;

                    //Mostrar resultats
                    System.out.println("\nHola " + name + "!");
                    System.out.println("Edat: " + age + " anys | Pes:" + weight + " kg | Alçada: " + height + " m");
                    System.out.println("IMC: " + imc + " (" + Categoria + ")");
                    System.out.println("FC màxima estimada: " + fcMax + " bpm");
                    System.out.println("Zona FC objectiu: " + fc50 + " - " + fc85 + " bpm");
                    System.out.println("Aigua recomenada: " + litres + " L/dia");
                    System.out.println("Any de naixement aprox: " + anyNaix);
                    break;

                case "x": //sortida del bucle
                sortida = true;
                System.out.println("Sortint del programa...");
                break;

                default:
                    System.out.println("Opció no valida!");
            }
        }
    } 
}
        

