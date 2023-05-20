package com.burakkolay.akbankhw2.dto.product;

public record ProductSaveRequest(
        String name,
        double price,
        String description) {
}
