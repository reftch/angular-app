package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "SQLQUERY")
@Data
@Entity
public class SqlQuery implements Serializable {

  @Id
  @Column(name = "SQLQUERYID", insertable = false, nullable = false)
  private String id;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "TEMPLATEKEY")
  private String templateKey;

  @Column(name = "TEMPLATEQUERY")
  private String templateQuery;

  @Column(name = "ADDSELECTPART")
  private String addSelectPart;

  @Column(name = "ADDJOINPART")
  private String addJoinPart;

  @Column(name = "WHEREPART")
  private String wherePart;

  @Column(name = "GROUPBYPART")
  private String groupByPart;

  @Column(name = "HAVINGPART")
  private String havingPart;

  @Column(name = "ORDERBYPART")
  private String orderByPart;

  @Column(name = "RESULTSETLIMIT", nullable = false)
  private Integer resultSetLimit;

  @Column(name = "DBMSID", nullable = false)
  private String dbmsId;

  @Column(name = "DESCRIPTION")
  private String description;

}