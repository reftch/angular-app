package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "JAVACMD")
public class JavaCmd implements Serializable {

  @Id
  @Column(name = "CMDID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "JAVACLASS", nullable = false)
  private String javaClass;

  @Column(name = "CFGID", nullable = false)
  private String cfgId;

  @Column(name = "DESCRIPTION")
  private String description;

  
}