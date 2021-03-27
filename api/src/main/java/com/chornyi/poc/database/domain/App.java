package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "APP")
@Data
@Entity
public class App implements Serializable {

  @Id
  @Column(insertable = false, name = "APPID", nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "CMDCLASS", nullable = false)
  private String cmdClass;

  @Column(name = "CMDTYPE", nullable = false)
  private String cmdType;

  @Column(name = "CMDCFGID", nullable = false)
  private String cmdCfgId;

  @Column(name = "BEFORECMDCLASS")
  private String beforeCmdClass;

  @Column(name = "BEFORECMDTYPE")
  private String beforeCmdType;

  @Column(name = "BEFORECMDCFGID")
  private String beforeCmdCfgId;

  @Column(name = "AFTERCMDCLASS")
  private String afterCmdClass;

  @Column(name = "AFTERCMDTYPE")
  private String afterCmdType;

  @Column(name = "AFTERCMDCFGID")
  private String afterCmdCfgId;

  @Column(name = "ERRORCMDCLASS")
  private String errorCmdClass;

  @Column(name = "ERRORCMDTYPE")
  private String errorCmdType;

  @Column(name = "ERRORCMDCFGID")
  private String errorCmdCfgId;
  
}