package com.martins.eduinvest.model;
import com.martins.eduinvest.enums.AdminRole;
import com.martins.eduinvest.model.baseentities.BioDetails;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
public class Admin extends BioDetails {

    @Column(unique = true)
    private String superAdminEmail;

    private AdminRole adminRole;

}