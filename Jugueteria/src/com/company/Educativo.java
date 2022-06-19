package com.company;

public class Educativo extends Juguete{
    private int edadMaxima;
    private double bonificacionPrecio;
    // constructor 1. sin numero de jugadores
    public Educativo(String nombre, int edadMinima, int precioBase, int edadMaxima, double bonificacionPrecio) throws EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        validateJugEducativo(edadMinima, precioBase, edadMaxima, bonificacionPrecio);
    }
    // constructor 2. con numeros de jugadores
    public Educativo(String nombre, int numeroJugadores, int edadMinima, int precioBase, int edadMaxima, double bonificacionPrecio) throws EinvalidPropertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        validateJugEducativo(edadMinima, precioBase, edadMaxima, bonificacionPrecio);

    }
    private void validateJugEducativo(int edadMinima, int precioBase, int edadMaxima, double bonificacionPrecio) throws EinvalidPropertyException {
        if (edadMaxima <= edadMinima) throw new EinvalidPropertyException("La edad max no puede ser inferior o igual a la edad min.");
        this.edadMaxima = edadMaxima;
        if(bonificacionPrecio<=0) throw new EinvalidPropertyException("La bonificacion no puede ser inf o igual a 0.");
        if (bonificacionPrecio >= precioBase) throw new EinvalidPropertyException("La bonificacion ha de ser menor que el precio base.");
        this.bonificacionPrecio = bonificacionPrecio;
    }


    @Override
    public double getPrecio() {
        return getPrecioBase() - bonificacionPrecio;
    }

    @Override
    public String toString() {
        return "Educativo{" +
                "edadMaxima=" + edadMaxima +
                ", bonificacionPrecio=" + bonificacionPrecio +
                ", nombre='" + nombre + '\'' +
                ", numeroJugadores=" + numeroJugadores +
                ", edadMinima=" + edadMinima +
                ", precioBase=" + precioBase +
                '}';
    }
}

