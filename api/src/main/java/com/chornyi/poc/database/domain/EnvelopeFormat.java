package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ENVELOPEFORMAT")
public class EnvelopeFormat implements Serializable {

  @Id
  @Column(name = "FORMAT", insertable = false, nullable = false)
  private String id;

  @Column(name = "WIDTH")
  private Integer width;

  @Column(name = "HEIGHT")
  private Integer height;

  @Column(name = "DESCRIPTION")
  private String description;

}