package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Table for user defined job properties
 */
@Table(name = "JOBUSERPROPERTIES")
@Entity
@Data
public class JobUserProperties implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "JOBID", nullable = false)
  private Long jobId;

  @Column(name = "NAME")
  private String name;

  @Column(name = "STRVALUE")
  private String strValue;

}