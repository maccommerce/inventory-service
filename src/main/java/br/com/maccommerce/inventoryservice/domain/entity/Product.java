package br.com.maccommerce.inventoryservice.domain.entity;

import lombok.Data;

public @Data class Product {

    private String id;
    private String name;
    private String description;
    private Double price;
    private Category category;

    private static @Data class Category {

        private String id;
        private String name;
        private String description;

    }

}
