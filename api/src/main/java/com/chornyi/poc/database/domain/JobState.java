package com.chornyi.poc.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "JOBSTATE")
@Entity
public class JobState implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "SRCJOBID", nullable = false)
  private Long srcJobId;

  @Column(name = "NEWJOBID")
  private Long newJobId;

  @Column(name = "FNC")
  private String fnc;

  @Column(name = "STATE")
  private String state;

  @Column(name = "DATETIME", nullable = false)
  private Timestamp datetime;

}