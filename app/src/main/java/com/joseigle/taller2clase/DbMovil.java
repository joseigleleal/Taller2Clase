package com.joseigle.taller2clase;

import java.util.ArrayList;

public class DbMovil {
    private static ArrayList<Movil> Moviles= new ArrayList<>();

    public static void Guardar(Movil Movil){
        Moviles.add(Movil);
    }

    public static ArrayList<Movil> Obtener(){
        return Moviles;
    }
}
