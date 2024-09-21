package com.martins.eduinvest.model;

import com.martins.eduinvest.enums.CustomerToChildRelationship;
import com.martins.eduinvest.enums.ProductType;
import com.martins.eduinvest.model.baseentities.Address;
import com.martins.eduinvest.model.baseentities.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Children extends User {

    private CustomerToChildRelationship toChildRelationship;
    private String schoolType;
    private ProductType productType;
    private String schoolName;
    private Address schoolAddress;
    private String classType;

}
