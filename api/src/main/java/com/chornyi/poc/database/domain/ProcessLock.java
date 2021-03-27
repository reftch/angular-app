package com.chornyi.poc.database.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PROCESSLOCK")
public class ProcessLock implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "CREATETIME", nullable = false)
  private Timestamp createTime;

  @Column(name = "TASKID")
  private String taskId;

  @Column(name = "LOCKTYPE", nullable = false)
  private String lockType;

  @Column(name = "JOBID")
  private Long jobId;

}