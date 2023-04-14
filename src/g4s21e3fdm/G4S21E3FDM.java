/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21e3fdm;

/**
 *
 * @author ACER
 */
public class G4S21E3FDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("operaciones"+ args.length);
        for (int a =0; a<args.length;a++)
            
        System.out.println("valor#"+a+", contiene ->"+ args[a]);
        for (int a=0; a<args.length;a++){
            if(args[a].equals("3-5")) break;
            System.out.println("el resultado es 8, del valor #"+args[a]);
  
        }
        for (int a=1; a<args.length;a++){
         if(args[a].equals("3x5")) break;
        System.out.println("el resultado es -2, del valor #"+args[a]);

            
        }
        for (int a=2; a<args.length;a++){
         if(args[a].equals("3/5")) break;
        System.out.println("el resultado es 15, del valor #"+args[a]);
        }
        for (int a=3; a<args.length;a++){
         if(args[a].equals("")) break;
        System.out.println("el resultado es 0, del valor #"+args[a]);
        }
        
        
        System.out.println("nos salimos de la ejecucion");
    }
    
}
