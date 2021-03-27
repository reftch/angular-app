package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "IMPORTTASK")
public class ImportTask implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "IMPORTTASKID", insertable = false, nullable = false)
  private String id;

  @Column(name = "JAVACLASS", nullable = false)
  private String javaClass;

  @Column(name = "JOBGROUP", nullable = false)
  private String jobGroup;

  @Column(name = "JOBTRIGGER", nullable = false)
  private String jobTrigger;

  @Column(name = "APPID", nullable = false)
  private String appId;

  @Column(name = "TRIGGERDIRID")
  private String triggerId;

  @Column(name = "TRIGGERFILEPATTERN")
  private String triggerFilePattern;

  @Column(name = "DELTRIGFILE")
  private String delTrigFile;

  @Column(name = "OUTPUTDIRID", nullable = false)
  private String outputDir;

  @Column(name = "JOBCLASSID", nullable = false)
  private String jobClassId;

  @Column(name = "POSTEVENT")
  private String postEvent;

  @Column(name = "CHECKZIP")
  private String checkZip;

  @Column(name = "CHECKCOUNTRY")
  private String checkCountry;

  @Column(name = "ERRORJOB")
  private String errorJob;

  @Column(name = "SPLIT")
  private String split;

  @Column(name = "SINGLEFORM")
  private String singleForm;

  @Column(name = "IMPORTMODE")
  private String importMode;

  @Column(name = "ENCODING")
  private String encoding;

  @Column(name = "ACTIVATE")
  private String activate;

  @Column(name = "PROCESSID", insertable = false, nullable = false)
  private String processId;

  @Column(name = "USECSVFILENAMEINPAGES")
  private String useCsvFilenamePages;

  @Column(name = "EXCEPTIONONCSVERROR")
  private String exceptionOnCsvError;

  @Column(name = "QUOTECHAR")
  private String quoteChar;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "RELAXED")
  private String relaxed;

  @Column(name = "MAILID")
  private String mailId;

}