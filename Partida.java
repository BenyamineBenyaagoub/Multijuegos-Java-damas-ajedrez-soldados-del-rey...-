package LeAjedrez;

/**
 *
 * @author Javier
 */
import java.util.Scanner;

public class Partida {
    
    public static Tabla getTabla() {
        
        return Tabla.tabla;
    }
    static boolean elTurno;
    static int turno;
    
    
    static void cambioTurno(){
        if (turno%2==0) {
            elTurno = true;
        }else{
            elTurno= false;
        }
    }

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟");
        System.out.println("OnLine : 1");
        System.out.println("OffLine : 2");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("1 : servidor");
            System.out.println("2 : cliente");
            int a = sc.nextInt();
            if (a == 1) {
                getTabla().initServer();
            } else {
                System.out.println("ip:");
                String ip = sc.nextLine();
                ip = sc.nextLine();
                getTabla().initClient(ip);
            }            
        }
        
        Guardar.Ecargar();
        getTabla().carga();
        
        if (!(Guardar.exi())) {
            System.out.println("No tienes ninguna partida guardada!");
            EleccionDeJuego.elige();
        }
        
        boolean loop = true;
        
        getTabla().getT();
        while (loop) {
            
            Promociones.ascention();
            System.out.println("fila");
            int fila1 = sc.nextInt();
            System.out.println("columna");
            int columna1 = sc.nextInt();
            System.out.println("fila");
            int fila = sc.nextInt();
            System.out.println("columna");
            int columna = sc.nextInt();
            if (getTabla().mover(fila1, columna1, fila, columna)) {
                cambioTurno();
            }
            if (Dama.SegundoSalto) {
                Dama.boNDama(fila, columna);
            } else if (DamaDoble.otra) {
                DamaDoble.bon(fila, columna);
            }
            
            getTabla().tabla();
            getTabla().getT();            
            getTabla().guarda();
            if (opcion == 1) {
                getTabla().envia();
                getTabla().recibe();
            }
            
            if (EleccionDeJuego.eleccionVictoria()) {
                loop = false;                
            }
            turno ++;
            
        }
        
    }
}
