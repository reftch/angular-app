package com.chornyi.poc.database.domain;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "PROCESSUNIT")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Process {

    @Id
    @NotNull
    @Column(name = "processid")
    private String processId;

    @NotNull
    @Column(name = "customerid")
    private String customerId;

    @Column(name = "clientinfo")
    private String clientInfo;

    @Column(name = "versioninfo")
    private String versionInfo;

    @Column(name = "systeminfo")
    private String systemInfo;
    
    @Column(name = "description")
    private String description;

}
