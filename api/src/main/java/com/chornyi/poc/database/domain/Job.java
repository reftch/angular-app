package com.chornyi.poc.database.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "JOB")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Job {

    @Id
    @Column(name = "jobid")
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "processid", length = 255, unique = true, nullable = false)
    private String processId;

    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "jobclassid", length = 64, unique = true, nullable = false)
    private String jobClassId;

    @Column(name = "userid")
    private Integer userId;

    @Column(name = "authorizationclass")
    private Integer authorizationClass;

    @Column(name = "state")
    private Integer state;

    @Column(name = "numpages")
    private Integer numPages;

    @Column(name = "numsheets")
    private Integer numSheets;

    @Column(name = "numdocuments")
    private Integer numDocuments;

    @Column(name = "creationdatetime")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    //@JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private LocalDateTime creationDate;

    @Size(min = 1, max = 255)
    @Column(name = "subclass")
    private String subClass;

    @Size(min = 1, max = 255)
    @Column(name = "jobinfo")
    private String jobInfo;

    @Size(min = 1, max = 255)
    @Column(name = "jobcomment")
    private String jobComment;

    @Size(min = 1, max = 255)
    @Column(name = "userfield0")
    private String userField0;

    @Size(min = 1, max = 255)
    @Column(name = "userfield1")
    private String userField1;

    @Size(min = 1, max = 255)
    @Column(name = "userfield2")
    private String userField2;

    @Size(min = 1, max = 255)
    @Column(name = "userfield3")
    private String userField3;

    @Size(min = 1, max = 255)
    @Column(name = "userfield4")
    private String userField4;

    @Size(min = 1, max = 255)
    @Column(name = "userfield5")
    private String userField5;

    @Size(min = 1, max = 255)
    @Column(name = "userfield6")
    private String userField6;

    @Size(min = 1, max = 255)
    @Column(name = "userfield7")
    private String userField7;

    @Size(min = 1, max = 255)
    @Column(name = "userfield8")
    private String userField8;

    @Size(min = 1, max = 255)
    @Column(name = "userfield9")
    private String userField9;

    @Column(name = "workflowid")
    private Long workflowId;

    @Column(name = "numdocsphysinserts")
    private Integer numDocsPhysInserts;

    @Column(name = "numdocselecinserts")
    private Integer numDocSelecInserts;

    @Column(name = "numdocscoversheets")
    private Integer numDocsCoverSheets;

    @Column(name = "numsheetselecinserts")
    private Integer numSheetSelecInserts;

    @Column(name = "numsheetscoversheets")
    private Integer numSheetsCoverSheets;

    @Column(name = "numsheetsstartend")
    private Integer numSheetsStartEnd;

    @Column(name = "numsheetsseparator")
    private Integer numSheetsSeparator;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "docjob",
            joinColumns = {@JoinColumn(name = "jobid", referencedColumnName = "jobid")},
            inverseJoinColumns = {@JoinColumn(name = "docid", referencedColumnName = "docid")})
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @BatchSize(size = 20)
    private Set<Doc> docs = new HashSet<>();

}
