package principal;

import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Application {

    private final static Scanner DADES = new Scanner(System.in);

    private static Parc[] parcs = new Parc[10];
    private static int pParcs = 0; //Priemra posició buida del vector parcs
    private static Parc parcActual = null;

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcio = 0;
        int tipusInstallacio = 0;
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió de parcs");
            System.out.println("\n2. Gestió d'atraccions");
            System.out.println("\n3. Gestió de botigues");
            System.out.println("\n4. Gestió de restaurants");
            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuParcs();
                    break;
                case 2:
                    if (parcActual != null) {
                        tipusInstallacio = 1;
                        menuInstallacions(tipusInstallacio);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el parc al menú Gestió de parcs");
                    }
                    break;
                case 3:
                    if (parcActual != null) {
                        tipusInstallacio = 2;
                        menuInstallacions(tipusInstallacio);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el parc al menú Gestió de parcs");
                    }
                    break;
                case 4:
                    if (parcActual != null) {
                        tipusInstallacio = 3;
                        menuInstallacions(tipusInstallacio);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el parc al menú Gestió de parcs");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuParcs() {
        int opcio = 0;

        do {
            int indexSel = -1;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista de parcs");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    parcs[pParcs] = Parc.addParc();
                    pParcs++;
                    break;
                case 2:
                    indexSel = selectParc();
                    if (indexSel >= 0) {
                        parcActual = parcs[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquest parc");
                    }
                    break;
                case 3:
                    indexSel = selectParc();
                    if (indexSel >= 0) {
                        parcs[indexSel].updateParc();
                    } else {
                        System.out.println("\nNo existeix aquest parc");
                    }
                    break;
                case 4:
                    for (int i = 0; i < pParcs; i++) {
                        parcs[i].showParc();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuInstallacions(int tipusInstallacio) {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta Instal·lacio");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista d'Instal·lacions");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    switch (tipusInstallacio) {
                        case 1:
                             parcActual.addAtraccio();
                            break;
                        case 2:
                             parcActual.addBotiga();
                            break;
                        case 3:
                             parcActual.addRestaurant();
                            break;
                        default:
                            break;
                    }
                   
                    break;

                case 2:
                    int indexSel = parcActual.selectInstallacio(tipusInstallacio, null);
                    if (indexSel >= 0) {
                        parcActual.getInstallacions()[indexSel].updateInstallacio();
                    } else {
                        System.out.println("\nNo existeix aquesta atracció");
                    }
                    break;
                case 3:
                    for (int i = 0; i < parcActual.getpInstallacions(); i++) {
                        parcActual.getInstallacions()[i].showInstallacio();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuAtraccions amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut parcActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea una atracció del parc actual. Penseu que Parc sap crear atraccions        
     Opció 2. Modificar -->    Permet modificar una atracció del parc actual
     (per comprovar l'existència de l'atracció tenim un mètode en la classe Parc que ens ajuda)
     Opció 3. Llista d'atraccions--> Imprimeix les dades de les atraccions del parc actual
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */

 /*
    public static void menuAtraccions() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista d'atraccions");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    parcActual.addAtraccio();
                    break;
                case 2:
                    int indexSel = parcActual.selectAtraccio(null);
                    if (indexSel >= 0) {
                        parcActual.getAtraccions()[indexSel].updateAtraccio();
                    } else {
                        System.out.println("\nNo existeix aquesta atracció");
                    }
                    break;
                case 3:
                    for (int i = 0; i < parcActual.getpAtraccions(); i++) {
                        parcActual.getAtraccions()[i].showAtraccio();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
     */

 /*
     TODO Heu de desenvolupar el menuBotigues amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut parcActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea una botiga del parc actual. Penseu que Parc sap crear botigues        
     Opció 2. Modificar -->    Permet modificar una botiga del parc actual
     (per comprovar l'existència de la botiga tenim un mètode en la classe Parc que ens ajuda)
     Opció 3. Llista de botigues--> Imprimeix les dades de les botigues del parc actual
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
 /*
    public static void menuBotigues() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista de botigues");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    parcActual.addBotiga();
                    break;
                case 2:
                    int indexSel = parcActual.selectBotiga(null);
                    if (indexSel >= 0) {
                        parcActual.getBotigues()[indexSel].updateBotiga();
                    } else {
                        System.out.println("\nNo existeix aquesta botiga");
                    }
                    break;
                case 3:
                    for (int i = 0; i < parcActual.getpBotigues(); i++) {
                        parcActual.getBotigues()[i].showBotiga();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
     */
 /*
     TODO Heu de desenvolupar el menuRestaurants amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut parcActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un restaurant del parc actual. Penseu que Parc sap crear restaurants        
     Opció 2. Modificar -->    Permet modificar un restaurant del parc actual
     (per comprovar l'existència del restaurant tenim un mètode en la classe Parc que ens ajuda)
     Opció 3. Llista de restaurants--> Imprimeix les dades dels restaurants del parc actual
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
 /*
    public static void menuRestaurants() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista de restaurants");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    parcActual.addRestaurant();
                    break;
                case 2:
                    int indexSel = parcActual.selectRestaurant(null);
                    if (indexSel >= 0) {
                        parcActual.getRestaurants()[indexSel].updateRestaurant();
                    } else {
                        System.out.println("\nNo existeix aquest restaurant");
                    }
                    break;
                case 3:
                    for (int i = 0; i < parcActual.getpRestaurants(); i++) {
                        parcActual.getRestaurants()[i].showRestaurant();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
     */
    public static Integer selectParc() {

        System.out.println("\nNom del parc?:");
        DADES.nextLine(); //Neteja de buffer        
        String nom = DADES.nextLine();

        for (int i = 0; i < pParcs; i++) {
            if (parcs[i].getNom().equals(nom)) {
                return i;
            }
        }
        return -1;
    }

}
