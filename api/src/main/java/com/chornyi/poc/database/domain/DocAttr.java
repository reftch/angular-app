package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DOCATTR")
@Data
public class DocAttr implements Serializable {

  @Id
  @Column(name = "DOCID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "ZIP")
  private String zip;

  @Column(name = "TOTALPAGES")
  private Integer totalPages;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "ISOCODE")
  private String isoCode;

  @Column(name = "VARIOOPT")
  private String varioOpt;

  @Column(name = "PREMIUMKDNR")
  private String premiumKdnr;

  @Column(name = "FC_TASKID")
  private String taskId;

  @Column(name = "FC_VERSION")
  private String version;

  @Column(name = "FC_SENDER")
  private String sender;

  @Column(name = "FC_REQUESTDATE")
  private String requestDate;

  @Column(name = "FC_LASTPROCESSLISTUPDATE")
  private String lastProcessListUpdate;

  @Column(name = "FC_LASTPOLICIESUPDATE")
  private String lastPoliciesUpdate;

  @Column(name = "FC_ENVELOPESTYLE")
  private String envelopeStyle;

  @Column(name = "FC_PRINTMODE")
  private String printMode;

  @Column(name = "FC_PAPERSTYLE")
  private String paperStyle;
  
}