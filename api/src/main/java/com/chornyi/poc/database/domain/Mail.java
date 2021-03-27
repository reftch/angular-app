package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MAIL")
public class Mail implements Serializable {

  @Id
  @Column(name = "MAILID", insertable = false, nullable = false)
  private String id;

  @Column(name = "BODY")
  private String body;

  @Column(name = "SUBJECT", nullable = false)
  private String subject;

  @Column(name = "PROTOCOL", nullable = false)
  private String protocol;

  @Column(name = "MAILHOST", nullable = false)
  private String mailHost;

  @Column(name = "PORT", nullable = false)
  private Integer port;

  @Column(name = "USERID", nullable = false)
  private String userId;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "FROM", nullable = false)
  private String from;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

}