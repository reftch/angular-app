package com.chornyi.poc.database.domain;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "DOCS")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Doc {

    @Id
    @Column(name = "docid")
    private Long id;

    @Column(name = "shipid")
    private Long shipId;

    @Size(min = 1, max = 100)
    @Column(name = "docclass", length = 100)
    private String docClass;

    @Column(name = "impdate")
    private LocalDateTime impDate;

    @Column(name = "copies")
    private Integer copies;

    @Size(min = 1, max = 100)
    @Column(name = "type", length = 100)
    private String type;

    @Column(name = "status")
    private Integer status;

    @Size(min = 1, max = 100)
    @Column(name = "priority", length = 100)
    private String priority;

    @Size(min = 1, max = 100)
    @Column(name = "outputtype", length = 100)
    private String outputType;

    @Column(name = "orderinshipment")
    private Integer orderInShipment;

    @Size(min = 1, max = 100)
    @Column(name = "docusage", length = 100)
    private String docUsage;

}
