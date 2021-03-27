package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRINTJOBCFG")
public class PrintJobCfg implements Serializable {

  @Id
  @Column(insertable = false, name = "PRINTJOBCFGID", nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "NAME")
  private String name;

  @Column(name = "QUERYREF", nullable = false)
  private String queryRef;

  @Column(name = "EXTRAQUERYREF")
  private String extraQueryRef;

  @Column(name = "APPID", nullable = false)
  private String appId;

  @Column(name = "CSVENCODING")
  private String csvEncoding;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "REPRINTAPPID")
  private String reprintAppId;

}