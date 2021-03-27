package com.chornyi.poc.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "MESSAGE")
@Data
public class Message implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "QUALIFIEDNAME")
  private String qualifiedName;

  @Column(name = "PROCESSID")
  private String processId;

  @Column(name = "APPID")
  private String appId;

  @Column(name = "TASKTYPE", nullable = false)
  private String taskType;

  @Column(name = "STARTTIME")
  private Timestamp startTime;

  @Column(name = "ENDTIME")
  private Timestamp endTime;

  @Column(name = "THREADNAME", nullable = false)
  private String threadName;

  @Column(name = "CTXKEY")
  private String ctxKey;

  @Column(name = "SUCCESS")
  private Integer success;

  @Column(name = "INTERRUPTED")
  private Integer interrupted;

}