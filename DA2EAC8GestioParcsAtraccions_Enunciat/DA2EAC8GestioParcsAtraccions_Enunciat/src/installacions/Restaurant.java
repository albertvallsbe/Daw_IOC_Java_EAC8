/*
* Classe que defineix un restaurant del parc d'atraccions. Es defineixen pel seu codi, 
* nom, tipus de menjar que serveix i espectacle que ofereix.
*/
package installacions;

import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Restaurant {
    
    private final static Scanner DADES = new Scanner(System.in);

    private String codi;
    private String nom;
    private String tipus;
    private String espectacle;

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
    
    NOTA: Pot passar que el restaurant no ofereixi cap espectacle, per tant, el
    valor d'espectacle que passarem per paràmetre serà null, així doncs no heu de 
    fer res especial.
     */
    public Restaurant(String codi, String nom, String tipusProductes, String espectacle) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipusProductes;
        this.espectacle = espectacle;
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEspectacle() {
        return espectacle;
    }

    public void setEspectacle(String espectacle) {
        this.espectacle = espectacle;
    }

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou restaurant. Les dades a demanar 
       són les que necessita el constructor.
     - També heu de tenir en compte que el nom, el tipus de menjar o l'espectacle poden ser una
       frase, per exemple, Cantó, menjar xinès i teatre d'ombres xineses.
     - Si el restaurant no ofereix cap espectacle, l'usuari no introduirà cap valor.
     
     Retorn: El nou restaurant creat.
     */
    public static Restaurant addRestaurant() {
        String codi, nom, tipus, espectacle;

        System.out.println("\nCodi del restaurant:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del restaurant:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de menjar que serveix el restaurant:");
        tipus = DADES.nextLine();
        System.out.println("\nEspectacle que ofereix el restaurant:");
        espectacle = DADES.nextLine();

        return new Restaurant(codi, nom, tipus, espectacle);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del restaurant actual i
       modificar els atributs corresponents d'aquest restaurant.
     - També heu de tenir en compte que el nom, el tipus de menjar o l'espectacle poden ser una
       frase, per exemple, Cantó, menjar xinès i teatre d'ombres xineses.
     - Si el restaurant no ofereix cap espectacle, l'usuari no introduirà cap valor.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
     Retorn: cap
     */
    public void updateRestaurant() {
        System.out.println("\nCodi del restaurant: " + codi);
        System.out.println("\nEntra el nou codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom del restaurant: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nTipus de menjar que serveix el restaurant: " + tipus);
        System.out.println("\nEntra el nou tipus de menjar:");
        tipus = DADES.nextLine();
        System.out.println("\nEspectacle que ofereix el restaurant:"+espectacle);
        System.out.println("\nEntra el nou tipus d'espectacle:");
        espectacle = DADES.nextLine();
    }

    public void showRestaurant() {
        System.out.println("\nLes dades del restaurant amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nTipus de menjar: " + tipus);
        
        if(espectacle==null||espectacle.isEmpty()){
            System.out.println("\nEl resturant no ofereix cap espectacle");
        }else{
            System.out.println("\nEspectacle: " + espectacle);
        }
    }
}
