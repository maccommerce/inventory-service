package br.com.maccommerce.inventoryservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InventoryNotFoundException extends RuntimeException {

    public InventoryNotFoundException(String id) {
        super("Inventory with id = " + id + " was not found.");
    }

}
