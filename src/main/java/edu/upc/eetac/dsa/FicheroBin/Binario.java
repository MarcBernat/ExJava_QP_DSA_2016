package edu.upc.eetac.dsa.FicheroBin;

/**
 * Created by marc on 21/02/16.
 */
public class Binario {
    /**
     * Iniciamos una classe binaria para poder traspasar los objetos a la hora de realizar una lectura/escritura
     */
        private int integro;
        private double decimal;
        private char caracter;

        //Constructor para crear la classe Binaria
        public Binario(int integro, double decimal, char caracter) {
            this.integro = integro;
            this.decimal = decimal;
            this.caracter = caracter;
        }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public int getIntegro() {
        return integro;
    }

    public void setIntegro(int integro) {
        this.integro = integro;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
}
