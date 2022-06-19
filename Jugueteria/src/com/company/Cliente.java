package com.company;

import java.util.HashSet;
//PUNTO 4. PROGRAMAR CLASE CLIENTE.
public class Cliente {
    private String nombreCliente;
    private HashSet<Juguete> juguetes;

    public Cliente(String nombreCliente, HashSet<Juguete> juguetes) throws EinvalidPropertyException {
        if(nombreCliente==null) throw new EinvalidPropertyException("El nombre del cliente no puede ser null");
        this.nombreCliente = nombreCliente;
        this.juguetes= juguetes;
    }

    public String getNombreCliente() {

        return nombreCliente;
    }
    //Fran no consigo encontrar el error con el metodo contains, he probado todas las combinaciones posibles y nada.
    // he probado los equals y estan bien.
    public void addJuguete(Juguete juguete) throws EinvalidPropertyException {
        this.juguetes.add(juguete);
        if (this.juguetes.contains(juguete.getNombre())) {
           throw new EinvalidPropertyException("No puede haber 2 juguetes iguales.");
        } else   this.juguetes.add(juguete);

    }
    public double calcularGasto(){
        final double[] gastoTotal = {0};

        juguetes.forEach(juguete -> gastoTotal[0] +=juguete.getPrecio());
      return gastoTotal[0];
    }
    public void listarJuguetes(){

        System.out.println("Lista de juguetes:");
        this.juguetes.forEach(juguete -> System.out.println(juguete.toString()));
    }
    @Override
    public boolean equals(Object o) {
        if(getClass()!=o.getClass()){
            return false;
        }
        Cliente other =(Cliente) o;
        if (this.nombreCliente.equals(other.getNombreCliente())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", juguetes=" + juguetes +
                '}';
    }
}
