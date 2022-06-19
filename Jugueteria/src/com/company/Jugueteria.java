package com.company;

import java.util.HashSet;
//PUNTO 5. PROGRAMAR LA CLASE JUGUETERIA

public class Jugueteria {
    private HashSet<Cliente> clientes;

    public Jugueteria() {

        this.clientes = new HashSet<>();
    }
    //Fran no consigo encontrar el error con el metodo contains, he probado todas las combinaciones posibles y nada.
    // He probado los equals y estan bien.
    public void addCliente(Cliente cliente) throws EinvalidPropertyException {
        this.clientes.add(cliente);
        if(this.clientes.contains(cliente.getNombreCliente())){
            this.clientes.remove(cliente);
        } else {
            this.clientes.add(cliente);
        }
    }
    public void listarJuguetesPorCliente(Cliente cliente) throws EinvalidPropertyException {
        if(!clientes.contains(cliente)){
            throw new EinvalidPropertyException("Este cliente no existe.");
        } else {
            this.clientes.forEach(Cliente::listarJuguetes);
        }

    }
    public void listarClientes(){
        System.out.println("Lista de clientes:");
        this.clientes.forEach(cliente -> System.out.println(cliente.toString()));
    }

    @Override
    public String toString() {
        return "Jugueteria{" +
                "clientes=" + clientes +
                '}';
    }
}
