package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class Referral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private String code;
    private String status;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @OneToOne(mappedBy = "referral")
    private Customer customer;

}