package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "DOCSCOMPONENT")
public class DocsComponent implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "TYPE", insertable = false, nullable = false)
  private String type;

  @Column(name = "PRINTMODE", nullable = false)
  private String printMode;

  @Column(name = "MEDID", nullable = false)
  private String mediaId;

  @Column(name = "MINAMOUNT", nullable = false)
  private Integer minAmount;

  @Column(name = "MAXAMOUNT", nullable = false)
  private Integer maxAmount;

  @Column(name = "ALLOWSINGLE", nullable = false)
  private String allowSingle;

  @Column(name = "TRAY")
  private String tray;

  @Column(name = "CHANNEL")
  private String channel;

  @Column(name = "USERFIELD0")
  private String userField0;

  @Column(name = "USERFIELD1")
  private String userField1;

  @Column(name = "USERFIELD2")
  private String userField2;

  @Column(name = "USERFIELD3")
  private String userField3;

  @Column(name = "USERFIELD4")
  private String userField4;

  @Column(name = "USERFIELD5")
  private String userField5;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "ENCLACTIVE", nullable = false)
  private String enclActive;

  @Column(name = "ENCLMANDATORY", nullable = false)
  private String enclMandatory;

  @Column(name = "ENCLNAME")
  private String enclName;

  @Column(name = "ENCLPRIORITY")
  private Integer enclPriority;

}