package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "SCHEDULER_ACTIVITY")
public class SchedulerActivity implements Serializable {

  @Id
  @Column(name = "ID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "GROUPNAME", nullable = false)
  private String groupName;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "TYPE", nullable = false)
  private String type;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "TIMESTAMP", nullable = false)
  private Long timestamp;

  @Column(name = "TASKID")
  private String taskId;

  @Column(name = "PARAMETER")
  private Long parameter;

  @Column(name = "STATE", nullable = false)
  private String state;

}