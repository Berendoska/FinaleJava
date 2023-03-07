package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



        Map<Integer, String> mapCharact = new HashMap<>();
        mapCharact.put(1, "ОЗУ");
        mapCharact.put(2, "производитель");
        mapCharact.put(3, "цвет");
        mapCharact.put(4, "диагональ");
        mapCharact.put(5, "цена");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вам нужен объем ОЗУ: 2, 8 , 16 -  ");
        int ramFind = scanner.nextInt();
        System.out.print("какая максимальная стоимость ноутбука  -  ");
        double priceFind = scanner.nextInt();
        System.out.println();
        scanner.close();



        Stream<Laptop> laptopStream = Stream.of(new Laptop("Sony", 22.8, "black", 200000, 8),
                new Laptop("Macbook", 60.8, "black", 1000000000, 16),
                new Laptop("Sony", 22.8, "silver", 200000, 8),
        new Laptop("Мир", 2, "серо-бурмалиновый", 20, 2),
                new Laptop("Macbook", 22.8, "black", 10000000, 16),
                new Laptop("Sony", 32.5, "silver", 200000, 8));



        laptopStream.filter(p->p.getPrice()<200000).forEach(p->System.out.println(p.getProducer()));


        laptopStream.filter(p->p.getRam()<8).forEach(p->System.out.println(p.getProducer()));


    }
    }
