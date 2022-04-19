/*
* Classe que defineix una botiga del parc d'atraccions. Es defineixen pel seu codi, 
* nom i tipus de productes que podem trobar.
 */
package installacions;

import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Botiga extends Servei{ 
    
    private final static Scanner DADES = new Scanner(System.in);
    
    

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */

    public Botiga(String codi, String nom, String tipusProductes) {
        super(codi, nom, tipusProductes);
        
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    
    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova botiga. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom o el tipus de producte poden ser una frase, per exemple, 
       Les Antípodes o artesania australiana.
     
     Retorn: La nova botiga creada.
     */
    public static Botiga addBotiga() {
        String codi, nom, tipus;

        System.out.println("\nCodi de la botiga:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de la botiga:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de productes que trobem en la botiga:");
        tipus = DADES.nextLine(); 

        return new Botiga(codi, nom, tipus);
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de la botiga actual i
       modificar els atributs corresponents d'aquesta botiga.
     - També heu de tenir en compte que el nom o el tipus de producte poden ser una frase, per exemple, 
       Les Antípodes o artesania australiana.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
     Retorn: cap
     */
    public void updateBotiga(String codi, String nom, String tipus) {
        System.out.println("\nCodi de la botiga: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de la botiga: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de productes que trobem en la botiga: " + tipus);
        System.out.println("\nEntra el nou tipus de productes:");
        tipus = DADES.nextLine();
    }
    
    public void showBotiga(String codi, String nom, String tipus) {
        System.out.println("\nLes dades de la botiga amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nTipus de productes: " + tipus);
    }
}
