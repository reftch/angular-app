package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "CMDPARAM")
@Entity
@Data
public class CmdParam implements Serializable {

  @Id
  @Column(name = "CMDID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(insertable = false, name = "PARAMID", nullable = false)
  private Integer paramId;

  @Column(name = "PARAMETER", nullable = false)
  private String parameter;

  @Column(name = "DESCRIPTION")
  private String description;

}