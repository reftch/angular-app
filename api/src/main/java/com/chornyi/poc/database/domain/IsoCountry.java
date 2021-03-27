package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ISOCOUNTRY")
public class IsoCountry implements Serializable {

  @Id
  @Column(name = "ISOCODE", insertable = false, nullable = false)
  private String code;

  @Column(name = "NATIONALCODE")
  private String nationalCode;

  @Column(insertable = false, name = "COUNTRY", nullable = false)
  private String country;

  @Column(name = "CONTINENT")
  private String continent;

}