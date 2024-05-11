package com.nike_clone.backend_nike.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_shoes")
public class Shoe implements ProductItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shoes_id", insertable = false, updatable = false, nullable = false)
    private UUID id;

    private String title;
    private String description;
    private Boolean isProductAvailable;
    private Integer quantity;
    private Double price;

    @Override
    public UUID getUniqueProductId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Boolean isProductAvailable() {
        return this.isProductAvailable;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }

    @Override
    public Double basePrice() {
        return this.price;
    }
}
