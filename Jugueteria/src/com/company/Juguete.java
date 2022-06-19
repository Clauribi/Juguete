package com.company;

import java.util.Objects;
// PUNTO 1. PROGRAMAR CLASE JUGUETE.y sus atributos
public  class Juguete {
    protected String nombre;
    protected int numeroJugadores;
    protected int edadMinima;
    protected int precioBase;

// PUNTO 1.A
    //constructor 1. sin numero de jugadores al ser opcional
    public Juguete(String nombre, int edadMinima, int precioBase) throws EinvalidPropertyException {
        validateJuguete(nombre, edadMinima, precioBase);
    }

    //constructor 2. teniendo en cuenta el numero de jugadores
    public Juguete(String nombre, int numeroJugadores, int edadMinima, int precioBase) throws EinvalidPropertyException {
        validateJuguete(nombre, edadMinima, precioBase);
        if (numeroJugadores<=0) throw new EinvalidPropertyException("El nº jugadores no puede ser inf o igual a 0.");
        this.numeroJugadores = numeroJugadores;

    }
    private void validateJuguete(String nombre, int edadMinima, int precioBase) throws EinvalidPropertyException {
        if(nombre ==null) throw new EinvalidPropertyException("El nombre no puede ser null.");
        this.nombre = nombre;
        if(edadMinima <0) throw new EinvalidPropertyException("La edad minima no puede ser inferior a 0.");
        this.edadMinima = edadMinima;
        if (precioBase <=0) throw new EinvalidPropertyException("El precio base no puede ser inferior o igual a 0.");
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getPrecioBase() {
        return precioBase;
    }
    //PUNTO 1.B METODO GETPRECIO

    public double getPrecio() {

        return this.precioBase;
    }

//PUNTO 3. METODO EQUALS. Para mantener el polimorfismo
    @Override
    public boolean equals(Object o) {
       if(getClass()!=o.getClass()){
           return false;
       }
       Juguete other =(Juguete) o;
       if (this.nombre.equals(other.getNombre())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", numeroJugadores=" + numeroJugadores +
                ", edadMinima=" + edadMinima +
                ", precioBase=" + precioBase +
                '}';
    }
}