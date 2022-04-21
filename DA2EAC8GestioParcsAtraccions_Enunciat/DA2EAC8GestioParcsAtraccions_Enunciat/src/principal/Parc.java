/*
 * Classe que defineix un parc d'atraccions. Un parc d'atraccions es defineix pel seu nom
 * que l'identifica (no hi ha dos parcs amb el mateix nom), adreça, un array d'atraccions, 
 * un array de botigues i un array de restaurants.
 */
package principal;

import java.util.Scanner;
import installacions.Atraccio;
import installacions.Restaurant;
import installacions.Botiga;
import installacions.Installacio;

/**
 *
 * @author fta
 */
public class Parc implements Installacio {

    private final static Scanner DADES = new Scanner(System.in);

    private String nom;
    private String adreca;
    private Installacio[] installacions = new Installacio[300];
    private int pInstallacions = 0;

    /*private Atraccio[] atraccions = new Atraccio[200];
        private int pAtraccions = 0; //Priemra posició buida de l'array d'atraccions
        private Restaurant[] restaurants = new Restaurant[50];
        private int pRestaurants = 0; //Priemra posició buida de l'array de restaurants
        private Botiga[] botigues = new Botiga[50];
        private int pBotigues = 0; //Priemra posició buida de l'array de botigues
     */
 /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe menys els arrays.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    public Parc(String nom, String adreca) {
        this.nom = nom;
        this.adreca = adreca;
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public Installacio[] getInstallacions() {
        return installacions;
    }

    public void setInstallacions(Installacio[] installacions) {
        this.installacions = installacions;
    }

    public int getpInstallacions() {
        return pInstallacions;
    }

    public void setpInstallacions(int pInstallacions) {
        this.pInstallacions = pInstallacions;
    }

    /*
        public Atraccio[] getAtraccions() {
            return atraccions;
        }

        public void setAtraccions(Atraccio[] atraccions) {
            this.atraccions = atraccions;
        }

        public int getpAtraccions() {
            return pAtraccions;
        }

        public void setpAtraccions(int pAtraccions) {
            this.pAtraccions = pAtraccions;
        }

        public Restaurant[] getRestaurants() {
            return restaurants;
        }

        public void setRestaurants(Restaurant[] restaurants) {
            this.restaurants = restaurants;
        }

        public int getpRestaurants() {
            return pRestaurants;
        }

        public void setpRestaurants(int pRestaurants) {
            this.pRestaurants = pRestaurants;
        }

        public Botiga[] getBotigues() {
            return botigues;
        }

        public void setBotigues(Botiga[] botigues) {
            this.botigues = botigues;
        }

        public int getpBotigues() {
            return pBotigues;
        }

        public void setpBotigues(int pBotigues) {
            this.pBotigues = pBotigues;
        }
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou parc. Les dades
     a demanar són les que passem per paràmetre en el constructor.
     - També heu de tenir en compte que el nom i l'adreça, poden ser una frase, per exemple,
     Parc Viatger o C/ Oceania, 15.
    
     Retorn: El nou taller creat.
     */
    public static Parc addParc() {

        String nom, adreca;

        System.out.println("\nNom del parc:");
        nom = DADES.nextLine();
        System.out.println("\nAdreça del parc:");
        adreca = DADES.nextLine();

        return new Parc(nom, adreca);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del parc actual i
       modificar els atributs corresponents d'aquest parc. Els únics atributs que
       modificarem són els que hem inicialitzat en el constructor amb els paràmetres passats.
     - També heu de tenir en compte que el nom i l'adreça, poden ser una frase, per exemple,
     Parc Viatger o C/ Oceania, 15.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateParc() {
        System.out.println("\nNom del parc: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nAdreça del parc: " + adreca);
        System.out.println("\nEntra la nova adreça:");
        adreca = DADES.nextLine();
    }

    public void showParc() {
        System.out.println("\nL'adreça del parc " + nom + " és " + adreca);
    }

    /*
     ATRACCIÓ
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix una nova atracció a l'array d'atraccions del parc actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Atraccio escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'atraccions si s'afegeix l'atracció.
     - Mostra el missatge "L'atracció ja existeix" si no s'ha afegit l'atracció.
    
     Retorn: cap
     */
    
    public int selectInstallacio(int tipusInstallacio, String codi) {
        int i = 0;
        if (codi == null) {
            System.out.println("\nCodi de l'atracció?:");
            codi = DADES.next();
        }

        switch (tipusInstallacio) {
            case 1:
                if (installacions[i] instanceof Atraccio) {
                    if (((Atraccio) installacions[i]).getCodi().equals(codi)) {
                        return i;
                    }
                    
                }   break;
            case 2:
                if (installacions[i] instanceof Botiga) {
                    if (((Botiga) installacions[i]).getCodi().equals(codi)) {
                        return i;
                    }
                    
                }   break;
            case 3:
                if (installacions[i] instanceof Restaurant) {
                    if (((Restaurant) installacions[i]).getCodi().equals(codi)) {
                        return i;
                    }
                    
                }   break;
            default:
                break;
        }
        

        return -1;
    }
    
    public void addAtraccio() {

        Installacio novaAtraccio = (Installacio) Atraccio.addAtraccio();

        if (selectInstallacio (((Installacio) novaAtraccio).getCodi()) == -1) {
            installacions[pInstallacions] = novaAtraccio;
            pInstallacions++;

            /*
            atraccions[pAtraccions] = novaAtraccio;
            pAtraccions++;
             */
        } else {
            System.out.println("\nL'atracció ja existeix");
        }
    }

    

    /*
        public int selectAtraccio(String codi) {

            if (codi == null) {
                System.out.println("\nCodi de l'atracció?:");
                codi = DADES.next();
            }

            for (int i = 0; i < pAtraccions; i++) {
                if (atraccions[i].getCodi().equals(codi)) {
                    return i;
                }
            }

            return -1;
        }
     */
 /*
     BOTIGA
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix una nova botiga a l'array de botigues del parc actual si aquesta no existeix. 
       Per afegir-la heu de fer servir el mètode de la classe Botiga escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array de botigues si s'afegeix la botiga.
     - Mostra el missatge "La botiga ja existeix" si no s'ha afegit la botiga.
    
     Retorn: cap
     */
    public void addBotiga() {

        Installacio novaBotiga = (Installacio) Botiga.addBotiga();

        if (selectInstallacio(((Installacio) novaBotiga).getCodi()) == -1) {
            installacions[pInstallacions] = (Installacio) novaBotiga;
            pInstallacions++;

        } else {
            System.out.println("\nLa Botiga ja existeix");
        }
    }

    /*
        public int selectBotiga(String codi) {

            if (codi == null) {
                System.out.println("\nCodi de la botiga?:");
                codi = DADES.next();
            }

            for (int i = 0; i < pBotigues; i++) {
                if (botigues[i].getCodi().equals(codi)) {
                    return i;
                }
            }

            return -1;
        }
     */
 /*
     RESTAURANT
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou restaurant a l'array de restaurants del parc actual si aquest no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe Restaurant escaient i per comprovar la seva 
       existència el mètode d'aquesta classe que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array de restaurants si s'afegeix el restaurant.
     - Mostra el missatge "El restaurant ja existeix" si no s'ha afegit el restaurant.
    
     Retorn: cap
     */
    public void addRestaurant() {
        Installacio nouRestaurant = (Installacio) Restaurant.addRestaurant();

        if (selectInstallacio(((Installacio) nouRestaurant).getCodi()) == -1) {
            installacions[pInstallacions] = (Installacio) nouRestaurant;
            pInstallacions++;
        } else {
            System.out.println("\nEl restaurant ja existeix");
        }

    }

    /*
            public int selectRestaurant(String codi) {

                if (codi == null) {
                    System.out.println("\nCodi del restaurant?:");
                    codi = DADES.next();
                }

                for (int i = 0; i < pRestaurants; i++) {
                    if (restaurants[i].getCodi().equals(codi)) {
                        return i;
                    }
                }

                return -1;
            }
     */
    @Override
    public void updateInstallacio() {
        System.out.println(this);
    }

    @Override
    public void showInstallacio() {
        System.out.println(this);
    }
}
