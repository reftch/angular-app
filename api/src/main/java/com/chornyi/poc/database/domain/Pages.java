package com.chornyi.poc.database.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "PAGES")
@Entity
public class Pages implements Serializable {

  @Id
  @Column(name = "DOCID", insertable = false, nullable = false)
  private Long docId;

  @Column(name = "FILENAME", nullable = false)
  private String fileName;

  @Column(name = "DIRID")
  private String dirId;

  @Column(name = "PAGEFROM", nullable = false)
  private Integer pageFrom;

  @Column(name = "PAGETO", nullable = false)
  private Integer pageTo;

  @Column(name = "NUMPAGES", nullable = false)
  private Integer numPages;

  @Column(name = "NUMSHEETS", nullable = false)
  private Integer numSheets;

  @Column(name = "MIXPLEXSEQ")
  private String mixplexseq;

  @Column(name = "COPYID")
  private Integer copyId;

  @Column(name = "SRCCSVFILENAME")
  private String srcCsvFilename;

  @Column(name = "SRCCSVRECORDNO")
  private Integer srcCsvRecordNo;

  @Column(name = "SRCMFFPROFILEPATH")
  private String srcMffProfilePath;

  @Column(name = "OUTSPOOLPAGEFROM")
  private Integer outSpoolPageFrom;

  @Column(name = "OUTSPOOLPAGETO")
  private Integer getOutSpoolPageTo;

  @Column(name = "OUTSPOOLFILENAME")
  private String outSpoolFilename;

  @Column(name = "OUTMFFPROFILEPATH")
  private String outMffProfilePath;

}