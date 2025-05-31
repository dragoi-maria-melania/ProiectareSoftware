package ro.ulbs.paradigme.lab9;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class    RandomNumberList {
    public static void main(String[] args) {
        //  Generare listă de 10 numere întregi aleatoare între 5 și 25
        Random random = new Random();
        List<Integer> lista = random.ints(10, 5, 26) // 26 este exclusiv
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista originală: " + lista);

        // a) Suma elementelor
        int suma = lista.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma elementelor: " + suma);

        // b) Valoarea maximă și minimă
        int maxim = lista.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        int minim = lista.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("Maximul: " + maxim);
        System.out.println("Minimul: " + minim);

        // c) Lista cu elemente în intervalul [10..20]
        List<Integer> filtrata = lista.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Elemente în intervalul [10..20]: " + filtrata);

        // d) Lista transformată în Double
        List<Double> listaDouble = lista.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Listă transformată în Double: " + listaDouble);

        // e) Verificare existență valoare 12
        boolean contine12 = lista.stream()
                .anyMatch(n -> n == 12);
        System.out.println("Lista conține valoarea 12? " + contine12);
    }
}
