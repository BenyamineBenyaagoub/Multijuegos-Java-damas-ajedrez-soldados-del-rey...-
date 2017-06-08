/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Guardar {

    static ObjectInputStream guardarInput;
    static ObjectOutputStream guardarOutput;

    public static void guardar(Casilla[][] ee) {
        try {
            guardarOutput = new ObjectOutputStream(new FileOutputStream("archivo.bin"));

            guardarOutput.writeObject(ee);

//            guardarOutput.writeObject(t);
//            guardarOutput.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    static File file = new File("archivo.bin");

    public static boolean exi() {

        return file.exists();
    }

    public static Casilla[][] Ecargar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargar partida : 1");
        System.out.println("Nueva partida : 2");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                return cargar();

            case 2:
                file.delete();
                final int mida = 8;

                Casilla[][] misCasillas = new Casilla[mida][mida];
                break;

        }
        return Tabla.misCasillas;
    }

    public static Casilla[][] cargar() {
        File file = new File("archivo.bin");

        try {
            if (file.exists()) {
                FileInputStream f = new FileInputStream("archivo.bin");

                guardarInput = new ObjectInputStream(f);

                Casilla[][] ca = ((Casilla[][]) guardarInput.readObject());
                guardarInput.close();
                return ca;
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException a) {
            {
                System.out.println(a);
            }

        }
        return null;
    }
}
