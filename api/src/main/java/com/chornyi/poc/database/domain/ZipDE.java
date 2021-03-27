package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "ZIPDE")
@Data
@Entity
public class ZipDE implements Serializable {

  @Id
  @Column(name = "ZIPCODE", insertable = false, nullable = false)
  private Integer zipCode;

  @Column(name = "VALID", nullable = false)
  private Integer valId;

}