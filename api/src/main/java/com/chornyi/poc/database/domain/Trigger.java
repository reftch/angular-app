package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "TRIGGER")
@Entity
@Data
public class Trigger implements Serializable {

  @Id
  @Column(insertable = false, name = "TRIGGERID", nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "TRIGGERTYPE", nullable = false)
  private String triggerType;

  @Column(name = "REPEATCOUNT", nullable = false)
  private Integer repeatCount;

  @Column(name = "REPEATINTERVALL", nullable = false)
  private Integer repeatInterval;

  @Column(name = "CRONEXPRESSION")
  private String cronExpression;

  @Column(name = "DESCRIPTION")
  private String description;

}