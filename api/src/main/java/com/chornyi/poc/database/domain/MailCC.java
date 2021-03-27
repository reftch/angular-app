package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MAILCC")
public class MailCC implements Serializable {

  @Id
  @Column(name = "MAILID", nullable = false)
  private String id;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "RECEIVERNAME", nullable = false)
  private String receiverName;

  @Column(name = "RECEIVERHOST", nullable = false)
  private String receiverHost;

  @Column(name = "DESCRIPTION")
  private String description;

}