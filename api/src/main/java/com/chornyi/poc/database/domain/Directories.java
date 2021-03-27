package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DIRECTORIES")
public class Directories implements Serializable {

  @Id
  @Column(name = "DIRID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "VALUE")
  private String value;

  @Column(name = "DESCRIPTION")
  private String description;
  
}