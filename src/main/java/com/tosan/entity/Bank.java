package com.tosan.entity;

import com.tosan.enums.BankType;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "M_BANK")
public class Bank {
    private Long id;
    private String name;
    private BankType bankType;

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue(generator = "BookIdGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BookIdGenerator", sequenceName = "BOOK_SEQ")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "BANK_TYPE")
    public BankType getBankType() {
        return bankType;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }
}
