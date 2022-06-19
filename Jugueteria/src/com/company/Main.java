package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        try {

            Cliente claudia = new Cliente("Claudia", new HashSet<>());
            claudia.addJuguete(new Electronico("robot", 10, 8, 2.50));
            claudia.addJuguete(new Educativo("cuentos", 5, 8, 10, 1.50));
            System.out.println(claudia.calcularGasto());
            claudia.listarJuguetes();
            Cliente valentina = new Cliente("Valentina", new HashSet<>());
            valentina.addJuguete(new Juguete("marvel", 4, 3, 20));
            valentina.addJuguete(new Electronico("furby", 10, 40, 2.50));
            valentina.addJuguete(new Educativo("puzzle", 12, 5, 30, 10, 2.50));
            System.out.println(valentina.calcularGasto());
            valentina.listarJuguetes();
            Jugueteria juguettos = new Jugueteria();
            juguettos.addCliente(new Cliente("Rocio", new HashSet<>()));
            juguettos.addCliente(new Cliente("Pepa", new HashSet<>()));
            juguettos.listarClientes();


        } catch (EinvalidPropertyException e) {
            e.printStackTrace();
        }


    }

}