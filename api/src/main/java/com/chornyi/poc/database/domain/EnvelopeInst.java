package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ENVELOPE_INST")
public class EnvelopeInst implements Serializable {

  @Id
  @Column(name = "ENVID", insertable = false, nullable = false)
  private String id;

  @Column(name = "ENVNAME")
  private String name;

  @Column(name = "ENVCUSTOMER")
  private String customer;

  @Column(name = "ENVWEIGHT")
  private Long weight;

  @Column(name = "ENVSIZE")
  private Long size;

  @Column(name = "ENVCAPACITY")
  private Long capacity;

  @Column(name = "ENVLENGTH")
  private Integer lenght;

  @Column(name = "ENVWIDTH")
  private Integer width;

  @Column(name = "ENVTHICKNESS")
  private Integer thickness;

  @Column(name = "ENVFORMAT")
  private String format;

  @Column(name = "FOLDINGFACTOR")
  private Integer foldingFormat;

  @Column(name = "INSTID", insertable = false, nullable = false)
  private Long instId;

}