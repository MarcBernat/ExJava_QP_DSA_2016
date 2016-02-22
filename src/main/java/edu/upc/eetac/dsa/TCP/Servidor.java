package edu.upc.eetac.dsa.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;

/**
 * Created by marc on 22/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/networking/sockets/clientServer.html
 */
public class Servidor {

    public static void main(String[] args) {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        //Comprobación del puerto
        if(args[1].isEmpty())
        {
            portNumber = 12345;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);

            for(;;)
            {
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println(sdf.format(System.currentTimeMillis()));
                out.flush();
            }
        }catch (SocketException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
