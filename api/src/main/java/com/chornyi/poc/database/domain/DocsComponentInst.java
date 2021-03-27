package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DOCSCOMPONENT_INST")
@Data
public class DocsComponentInst implements Serializable {

  @Id
  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "TYPE", insertable = false, nullable = false)
  private String type;

  @Column(name = "PRINTMODE", nullable = false)
  private String printMode;

  @Column(name = "MEDID", nullable = false)
  private String mediaMode;

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
  private String getUserField0;

  @Column(name = "USERFIELD1")
  private String getUserField1;
  @Column(name = "USERFIELD2")
  private String getUserField2;

  @Column(name = "USERFIELD3")
  private String getUserField3;

  @Column(name = "USERFIELD4")
  private String getUserField4;

  @Column(name = "USERFIELD5")
  private String getUserField5;

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

  @Column(name = "INSTID", insertable = false, nullable = false)
  private Long instId;

}