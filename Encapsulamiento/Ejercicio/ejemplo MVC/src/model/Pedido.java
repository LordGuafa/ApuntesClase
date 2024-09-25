package model;

//Modelado de los pedidos
public class Pedido {
    private double precioTe = 5.00;
    private double precioLate = 4.95;
    private double precioSoda = 3.50;
    private double precioCafe = 3.00;

    public double getPrecioTe() {
        return precioTe;
    }

    public double getPrecioLate() {
        return precioLate;
    }

    public double getPrecioSoda() {
        return precioSoda;
    }

    public double getPrecioCafe() {
        return precioCafe;
    }
}
