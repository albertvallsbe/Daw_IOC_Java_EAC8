
package installacions;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public interface Installacio {
    
    public  final static Scanner DADES = new Scanner(System.in);
    
    
    
    public abstract void updateInstallacio();
    
        
   
    public abstract void showInstallacio();
    
}
