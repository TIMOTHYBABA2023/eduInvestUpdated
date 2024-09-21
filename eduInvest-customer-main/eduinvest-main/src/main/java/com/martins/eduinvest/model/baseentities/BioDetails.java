package com.martins.eduinvest.model.baseentities;

import com.martins.eduinvest.enums.MethodFor2FA;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BioDetails extends User {

    @Column(nullable = false)
    private String phone;

    @Embedded
    private Address address;

    private MethodFor2FA methodFor2FA;
    private boolean google2FAEnabled;

}
