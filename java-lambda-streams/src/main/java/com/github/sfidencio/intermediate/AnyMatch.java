package com.github.sfidencio.intermediate;

import java.util.List;
import java.util.UUID;

public class AnyMatch {
    public static void main(String[] args) {

        var precoProcurado = 49.9;

        List<Product> products = List.of(
                new Product("Product 1", 10.0),
                new Product("Product 2", 20.0),
                new Product("Product 3", 30.0),
                new Product("Product 4", 40.0),
                new Product("Product 5", 50.0)
        );

        var result = products.stream().anyMatch(p->p.getPrice() < precoProcurado);
        System.out.printf("Existe produtos com preço procurado: %s\n", result);
    }

    public static class Product{
        private String id;
        private String name;
        private double price;

        public Product(String name, double price){
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public double getPrice(){
            return price;
        }

        @Override
        public String toString(){
            return "Product{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
