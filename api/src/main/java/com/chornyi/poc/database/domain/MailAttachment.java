package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MAILATTACHMENT")
public class MailAttachment {

  @Id
  @Column(name = "MAILID", nullable = false)
  private String id;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "TYPE", nullable = false)
  private String type;

  @Column(name = "ATTFILENAME")
  private String attFileName;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "DATATYPE", nullable = false)
  private String dataType;

  @Column(name = "ATTACHMENT")
  private byte[] attachment;

}