package com.martins.eduinvest.model;

import com.martins.eduinvest.enums.AgentStatus;
import com.martins.eduinvest.enums.IdentificationType;
import com.martins.eduinvest.model.baseentities.BioDetails;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Agent extends BioDetails {

    private String accountName;
    private String accountNumber;
    private String bankName;
    private IdentificationType identificationType;
    private String idUpload;
    private boolean identityVerified;

    private AgentStatus agentStatus;
    private Long totalReferralsCount;
    private String referralCode;
    private Double referralBonus;
    private Double conversionRate;
    private boolean emailVerified;

}
