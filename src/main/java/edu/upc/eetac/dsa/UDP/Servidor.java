package edu.upc.eetac.dsa.UDP;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.text.SimpleDateFormat;

/**
 * Created by marc on 22/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/networking/datagrams/clientServer.html
 *
 * Tambíen cambiamos los ServerSocket (TCP) por DatagramSocket.
 *
 * Ha diferencia del TCP aquí tenemos que recibir el UDP y enviar el UDP en el mismo bucle for(;;)
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
            DatagramSocket datagramSocket = new DatagramSocket(portNumber);
            for(;;)
            {
                //Recibimos en estado de espera en .receive() -> y lo guardamos en el datagrampacket
                byte[] buffer = new byte[0];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);

                /**Después de esto hacemos el inverso que hemos hecho en la classe del cliente haciendo una transformación
                 * UTF --> DataOutputStream --> ByteArrayOutput --> DatagramPacket --> Envio
                 */

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);
                dos.writeUTF(sdf.format(System.currentTimeMillis()));
                byte[] data = baos.toByteArray();

                DatagramPacket dpenvio = new DatagramPacket(data, data.length, datagramPacket.getAddress(), datagramPacket.getPort());
                datagramSocket.send(dpenvio);


            }
        }catch (SocketException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
