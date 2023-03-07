package org.example;

import java.util.Map;
import java.util.stream.Collectors;

public class Laptop {

    private String producer;
    private double size;
    private String color;
    private int price;
    private int ram;

    public Laptop(String producer, double size, String color, int price, int ram) {
        this.producer = producer;
        this.size = size;
        this.color = color;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("Производитель: %s\n  размер экрана: %d см\n  цвет %d \n  цена %%d  \n  ОЗУ %s Гб \n",
                this.producer, this.size, this.color, this.price, this.ram);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            return this.producer.equals(((Laptop) obj).producer)
                    && this.ram == ((Laptop) obj).ram
                    && this.size == ((Laptop) obj).size
                    && this.color.equals(((Laptop) obj).color)
                    && this.price == ((Laptop) obj).price ;

        }
        return false;
    }

    public String getProducer() {
        return producer;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
}