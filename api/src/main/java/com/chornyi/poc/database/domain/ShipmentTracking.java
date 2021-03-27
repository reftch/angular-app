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

@Data
@Table(name = "SHIPMENT_TRACKING")
@Entity
public class ShipmentTracking implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "TRACKID", insertable = false, nullable = false)
  private Long id;

  @Column(name = "SHIPID", nullable = false)
  private Long shipId;

  @Column(name = "SEQUENCEID", nullable = false)
  private String sequenceId;

  @Column(name = "PROCESSID", nullable = false)
  private String processId;

  @Column(name = "TRACKDATE")
  private Timestamp trackDate;

  @Column(name = "TYPE", nullable = false)
  private String type;

  @Column(name = "RESULT", nullable = false)
  private String result;

  @Column(name = "INFO", nullable = false)
  private String info;

  @Column(name = "USERFIELD0", nullable = false)
  private String userField0;

  @Column(name = "USERFIELD1", nullable = false)
  private String userField1;

  @Column(name = "USERFIELD2", nullable = false)
  private String userField2;

  @Column(name = "USERFIELD3", nullable = false)
  private String userField3;

  @Column(name = "USERFIELD4", nullable = false)
  private String userField4;

}