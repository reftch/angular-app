package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "WORKFLOWDEF")
@Data
public class WorkflowDef implements Serializable {

  @Id
  @Column(name = "NAME", insertable = false, nullable = false)
  private String name;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "WORKFLOWXML")
  private String workflowXml;

  @Column(name = "DESCRIPTION")
  private String description;

}