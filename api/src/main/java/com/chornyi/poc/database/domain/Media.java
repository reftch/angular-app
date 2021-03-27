package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MEDIA")
public class Media implements Serializable {

  @Id
  @Column(name = "MEDID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "MEDNAME")
  private String name;

  @Column(name = "MEDTEXT")
  private String text;

  @Column(name = "MEDWEIGHT")
  private Long weight;

  @Column(name = "MEDSIZE")
  private String size;

  @Column(name = "MEDFOLDABLE")
  private String foldable;

  @Column(name = "THICKNESS")
  private Integer thickness;

}