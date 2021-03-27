package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "EXTERNALCMD")
@Entity
@Data
public class ExternalCmd implements Serializable {

  @Id
  @Column(name = "CMDID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "WORKDIR", nullable = false)
  private String workDir;

  @Column(name = "PROGPATH")
  private String progPath;

  @Column(name = "PROGNAME", nullable = false)
  private String progName;

  @Column(name = "USE_RET_CODE", nullable = false)
  private String returnCode;

  @Column(name = "INCLUDECONSOLE")
  private Boolean includeConsole;

  @Column(name = "DESCRIPTION")
  private String description;

}