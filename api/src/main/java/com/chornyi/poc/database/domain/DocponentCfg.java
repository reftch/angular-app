package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "DOCPONENTCFG")
@Entity
public class DocponentCfg implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(insertable = false, name = "PRINTJOBCFGID", nullable = false)
  private String printJobCfg;

  @Column(name = "DOCPONENTTYPE")
  private String docPonentType;

  @Column(name = "PARAMETER")
  private String parameter;

  @Column(name = "CONDITION")
  private String condition;

  @Column(name = "EXPRESSION")
  private String expression;

  @Column(name = "SEQUENCE", nullable = false)
  private Long sequence;

}