package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MESSAGE_JOB")
public class MessageJob implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "MESSAGEID", insertable = false, nullable = false)
  private Long messageId;

  @Column(name = "STATE")
  private String state;

}