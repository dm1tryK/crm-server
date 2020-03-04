package com.crm.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Service")
@Getter
@Setter
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String description;

    @OneToMany(
            mappedBy = "serviceType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ServiceForClient> serviceForClient;

}
