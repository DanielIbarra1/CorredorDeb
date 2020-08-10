package corredor;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
        Corredor e1 = new Corredor();
        int correr,recarga;
        String opc = null;
        
        
       System.out.print(" Cantidad de energia: ");
       e1.setEnergia(in.nextInt());
       do{
           System.out.println("\nCantidad de veces que correra : ");
           correr = in.nextInt();
       
            System.out.println("\nEl Competidor comenzara a correr.......");
            
            for(int i=0;i<correr;i++){
                    e1.correr();
                    e1.verificarEnergia();
            }
            
            System.out.print("\n La energia es de: "+e1.getEnergia()); 
            
            
            if(e1.getEnergia() == 0){
                System.out.println();
                e1.energiaCero();
                System.out.println("\nRecuperando energia.....");
                System.out.println("Cantidad de veces que entrenara el Corredor : "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    e1.recargarEnergia(9);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del Corredor es: "+e1.getEnergia());
            }
           
            else{
                System.out.println("\nRecuperando3 energia...");
                System.out.println("Cantidad de veces que quiere que el Corredor entrene: "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    e1.recargarEnergia(9);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del Corredor es: "+e1.getEnergia());
            }
            
            System.out.println("\n\nVolver a correr? (S/N)");
            opc = in.next();
            System.out.println("\n\n");
        }while("s".equals(opc) || "S".equals(opc) || "si".equals(opc) || "SI".equals(opc) || "Si".equals(opc));    
        
       
        
    }
    
}