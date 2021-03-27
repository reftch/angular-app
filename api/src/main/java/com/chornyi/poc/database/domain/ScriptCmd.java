package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "SCRIPTCMD")
@Entity
public class ScriptCmd implements Serializable {

  @Id
  @Column(name = "SCRIPTID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "SCRIPTLANGUAGE", nullable = false)
  private String scriptLanguage;

  @Column(name = "TYPE", nullable = false)
  private String type;

  @Column(name = "SCRIPTFILE")
  private String scriptFile;

  @Column(name = "SCRIPT")
  private String script;

  @Column(name = "DESCRIPTION")
  private String description;

}