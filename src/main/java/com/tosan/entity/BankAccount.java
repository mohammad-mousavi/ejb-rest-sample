package com.tosan.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "M_BANK_ACCOUNT")
public class BankAccount {

    private Long id;
    private String accountNo;

    @Id
    @Column(name = "ACC_ID")
    @GeneratedValue(generator = "BankAccountGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BankAccountGenerator", sequenceName = "BANK_ACC_SEQ")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "ACC_NO")
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
