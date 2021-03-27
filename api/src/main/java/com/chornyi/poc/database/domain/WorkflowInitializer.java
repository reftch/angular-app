package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "WORKFLOW_INITIALIZER")
public class WorkflowInitializer implements Serializable {

  @Id
  @Column(name = "ID", nullable = false)
  private Integer id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "CONFIGPATH", nullable = false)
  private String configPath;

  @Column(name = "FILENAME", nullable = false)
  private String filename;

  @Column(name = "ISZIPPEDCONFIGFILE", nullable = false)
  private Boolean isZippedConfigFile;

  @Column(name = "ISZIPPEDCONFIGURATION", nullable = false)
  private Boolean isZippedConfiguration;

  @Column(name = "INITIALPARAMETER")
  private byte[] initialParameter;

}