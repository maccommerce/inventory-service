package br.com.maccommerce.inventoryservice.app.web.entity;

import lombok.Data;

public @Data class InventoryRegister {

    private String productId;
    private String description;
    private Long amount;

}
