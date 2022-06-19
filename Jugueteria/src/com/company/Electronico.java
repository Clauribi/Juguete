package com.company;

public class Electronico extends Juguete {
    private double recargoPrecio;
    //constructor 1. sin nº de jugadores
    public Electronico(String nombre, int edadMinima, int precioBase, double recargoPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        validateJugElectronico(precioBase, recargoPrecio);
    }
    //constructor 2.con nº de jugadores
    public Electronico(String nombre, int numeroJugadores, int edadMinima, int precioBase, double recargoPrecio) throws EinvalidPropertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        validateJugElectronico(precioBase, recargoPrecio);

    }
    private void validateJugElectronico(int precioBase, double recargoPrecio) throws EinvalidPropertyException {
        if (recargoPrecio <=0) throw new EinvalidPropertyException("El recargo en el precio no puede ser inf o igual a 0.");
        if(recargoPrecio >= precioBase) throw new EinvalidPropertyException("El recargo ha de ser menor que el precio base.");
        this.recargoPrecio = recargoPrecio;
    }

    @Override
    public double getPrecio() {
        return this.getPrecioBase()+recargoPrecio;
    }

    @Override
    public String toString() {
        return "Electronico{" +
                "recargoPrecio=" + recargoPrecio +
                ", nombre='" + nombre + '\'' +
                ", numeroJugadores=" + numeroJugadores +
                ", edadMinima=" + edadMinima +
                ", precioBase=" + precioBase +
                '}';
    }
}
