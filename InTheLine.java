/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeAjedrez;

/**
 *
 * @author Javier
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class InTheLine {
    
    private final int port = 9000;
    Casilla[][] casilla = null;
    String destiAddres;
    Socket clientSoc;
    ServerSocket serverSoc;
    ObjectInputStream entrada;
    ObjectOutputStream sortida;

    public void setDestiAddres(String destiAddres) {
        this.destiAddres = destiAddres;
    }

    public Casilla[][] initServer(){
        try {
            serverSoc = new ServerSocket(port);
            clientSoc = serverSoc.accept();

            entrada = new ObjectInputStream(clientSoc.getInputStream());
            sortida = new ObjectOutputStream(clientSoc.getOutputStream());
            casilla = (Casilla[][]) entrada.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return casilla;
    }

    public void initClient(String ip){
        try {
            clientSoc = new Socket(ip,9000);

            sortida = new ObjectOutputStream(clientSoc.getOutputStream());
            entrada = new ObjectInputStream(clientSoc.getInputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void envia(Casilla[][] a){
        try {
            sortida.writeObject(a);
            sortida.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Casilla[][] reb(){
        try {

            casilla = (Casilla[][]) entrada.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return casilla;
    }




    public Casilla[][] getTauler() {
        return casilla;
    }
}

