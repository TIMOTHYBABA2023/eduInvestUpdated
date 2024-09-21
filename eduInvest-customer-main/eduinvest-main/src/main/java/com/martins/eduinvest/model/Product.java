package com.martins.eduinvest.model;

import com.martins.eduinvest.enums.ProductType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private Long productCost;
    private ProductType productType;
    private Integer productDuration;
    private LocalDate purchaseDate;
    private Integer totalProducts;
    private Integer activeProducts;
    private Integer offlineProducts;
    private boolean status;

}
