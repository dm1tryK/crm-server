package com.crm.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Schedule {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime timeStart;

    @Column
    private LocalDateTime timeEnd;

    @Column
    private LocalDateTime timeStartFact;

    @Column
    private LocalDateTime timeEndFact;

    @Column
    private BigDecimal cost;

    @ManyToOne
    private Currency currency;
}
