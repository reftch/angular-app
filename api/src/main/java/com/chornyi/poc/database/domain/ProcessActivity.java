package com.chornyi.poc.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "PROCESS_ACTIVITY")
@Data
@Entity
public class ProcessActivity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "SEQUENCE_NAME", nullable = false)
  private String sequenceName;

  @Column(name = "HANDLER_NAME", nullable = false)
  private String handlerName;

  @Column(name = "JOB_ID", nullable = false)
  private Long jobId;

  @Column(name = "TIMESTAMP", nullable = false)
  private Timestamp timestamp;

  @Column(name = "CONTEXT", nullable = false)
  private String context;

  @Column(name = "STATE", nullable = false)
  private String state;

  @Column(name = "SELECTOR", nullable = false)
  private String selector;

}