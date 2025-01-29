package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {

    public Mapa() {
        hashMap();
        linkedHashMap();
        TreeMap();
    }

    public void hashMap(){
        HashMap<String, Integer> mapa = new HashMap<>();
        System.out.println("\n------ HashMap ------");

        mapa.put("Manzana", 10);
        mapa.put("Pera", 10);
        mapa.put("Durazno", 10);
        mapa.put("Mango", 10);

        System.out.println(mapa);
        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay pera " + mapa.containsKey("Kiwi"));

        // obtener valor
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // eliminar valor
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void linkedHashMap(){
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        System.out.println("\n------ linkedHashMap ------");

        mapa.put("Manzana", 10);
        mapa.put("Pera", 20);
        mapa.put("Durazno", 30);
        mapa.put("Mango", 40);

        System.out.println(mapa);
        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay pera " + mapa.containsKey("Kiwi"));

        // obtener valor
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // eliminar valor
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    // Diccionario de la vida real

    public void TreeMap(){
        TreeMap<String, Integer> mapa = new TreeMap<>();

        System.out.println("\n------ TreeMap ------");

        mapa.put("Manzana", 10);
        mapa.put("Pera", 10);
        mapa.put("Durazno", 10);
        mapa.put("Mango", 10);

        System.out.println(mapa);
        // containsKey
        System.out.println("Hay pera " + mapa.containsKey("Pera"));
        System.out.println("Hay pera " + mapa.containsKey("Kiwi"));

        // obtener valor
        System.out.println("Valor de pera " + mapa.get("Pera"));

        // eliminar valor
        mapa.remove("Pera");

        System.out.println(mapa);
    }
}
