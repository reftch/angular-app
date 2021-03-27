package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PROPERTIES")
@Data
public class Properties implements Serializable {

  @Id
  @Column(name = "PROPID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "NAME", insertable = false, nullable = false)
  private String name;

  @Column(name = "VALUE")
  private String value;

  @Column(name = "DESCRIPTION")
  private String description;

}