package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "COUNTER")
public class Counter implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "CURRENTVAL", nullable = false)
  private Long currentValue;

  @Column(name = "MAXVAL", nullable = false)
  private Long maxValue;

  @Column(name = "INCR", nullable = false)
  private Integer increment;

  @Column(name = "DESCRIPTION")
  private String description;

}