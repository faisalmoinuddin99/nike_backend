package com.nike_clone.backend_nike.model;

import java.util.UUID;

/**
 * @author <a href="mailto: faisal25march99@gmail.com">
 * Single Reponsibility Principal
 */
public interface ProductItems {

    /*
     * Core Identification Attribute
     */
    public UUID getUniqueProductId();

    public String getTitle();

    public String getDescription();

    /*
     * Inventory and Availability
     */
    public Boolean isProductAvailable();

    public Integer getQuantity();

    /*
     * Price and Sales
     */
    public Double basePrice();


}
