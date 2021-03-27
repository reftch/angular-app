package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Table for parameters for SQLQUERY queries
 */
@Table(name = "SQLQUERYPARAM")
@Data
@Entity
public class SqlQueryParam implements Serializable {

  @Id
  @Column(name = "SQLQUERYID", insertable = false, nullable = false)
  private String sqlQueryId;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "PARAMNAME", insertable = false, nullable = false)
  private String paramName;

  @Column(name = "PARAMTYPE", nullable = false)
  private String paramType;

  @Column(name = "POSITION", nullable = false)
  private Integer position;

  @Column(name = "DESCRIPTION")
  private String description;

}