package com.crm.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ServiceForClient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    private ServiceType serviceType;

    @Column
    private BigDecimal cost;
}
