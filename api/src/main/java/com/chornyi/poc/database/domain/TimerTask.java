package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "TIMERTASK")
@Data
@Entity
public class TimerTask implements Serializable {

  @Id
  @Column(insertable = false, name = "TIMERTASKID", nullable = false)
  private String id;

  @Column(name = "JAVACLASS", nullable = false)
  private String javaClass;

  @Column(name = "APPID", nullable = false)
  private String appId;

  @Column(name = "JOBGROUP", nullable = false)
  private String jobGroup;

  @Column(name = "JOBTRIGGER", nullable = false)
  private String jobTrigger;

  @Column(name = "PROPID")
  private String propId;

  @Column(name = "ACTIVATE")
  private String activate;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "DESCRIPTION")
  private String description;

}