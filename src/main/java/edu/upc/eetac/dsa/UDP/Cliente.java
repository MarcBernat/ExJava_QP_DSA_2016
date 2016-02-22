package edu.upc.eetac.dsa.UDP;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by marc on 22/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/networking/datagrams/clientServer.html
 *
 * AL tener un datagrama UDP no se establece connexión con el servidor a diferencia del TCP. Así pues es necessario
 * enviar un primer paquete UDP para "activar al servidor".
 *
 * Tambíen a diferencia de TCP los datagramas se realizan con mediante un DatagramPacket donde este lo
 * utilizamos como una especie de contenedor tanto como enviar como recibir.
 *
 * byte[] data = new byte[0] para realizar los envios añadimos la información en un vector de bytes.
 *
 * Para traducir la dirreción utilizamos el metodo InetAddres.getByName
 *
 *
 */
public class Cliente {
    public static void main(String[] args) {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try {

            //Enviamos el UDP de aviso
            byte[] data = new byte[0];
            DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName(hostName), portNumber);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(dp);

            /**
             * Para realizar la conversión proviniente de UDP tenemos que convertir la expressión de bytes a un
             * "lenguaje" de objeto para poder manipular en java
             *
             * LA transformación tipica que haremos en el cloente sera esta
             * byte[] array --> DatagramPacket --> ByteArrayInputStream --> DataInputStream --> UTF
             *
             * En el siguiente recibimos la respuesta del servidor
             */
            byte[] buffer = new byte[1500];
            dp = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(dp);
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(dp.getData()));
            System.out.println("Hora:" + dis.readUTF());

        }
        catch (SocketException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
