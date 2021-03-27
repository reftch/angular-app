package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "PAPERSIZE")
@Entity
public class PaperSize implements Serializable {

  @Id
  @Column(name = "FORMAT", insertable = false, nullable = false)
  private String format;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "THICKNESSFACTOR", insertable = false, nullable = false)
  private Integer thicknessFactor;

  @Column(name = "WIDTH")
  private Integer width;

  @Column(name = "HEIGHT")
  private Integer height;

  @Column(name = "PREFOLDED")
  private String preFolded;

  @Column(name = "DESCRIPTION")
  private String description;

}