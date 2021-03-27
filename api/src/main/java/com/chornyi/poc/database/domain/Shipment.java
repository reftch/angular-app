package com.chornyi.poc.database.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SHIPMENT")
public class Shipment implements Serializable {

  @Id
  @Column(insertable = false, name = "SHIPID", nullable = false)
  private Long id;

  @Column(name = "PRODUCTID", nullable = false)
  private Integer productId;

  @Column(name = "PORTO", nullable = false)
  private Long portTo;

  @Column(name = "ENVID")
  private String envId;

  @Column(name = "LFDNUM", nullable = false)
  private String lfdNum;

  @Column(name = "SEQUENCEID")
  private String sequenceId;

  @Column(name = "PRINTJOBCFGID")
  private String printJobCfgId;

  @Column(name = "SHIPWEIGHT", nullable = false)
  private Integer shipWeight;

  @Column(name = "SHIPSHEETS", nullable = false)
  private Integer shipSheets;

  @Column(name = "ABRNR")
  private Integer abrnr;

  @Column(name = "MEHRZWECK")
  private String mehrzweck;

  @Column(name = "AUFL_TT")
  private String aufltt;

  @Column(name = "LSKENNUNG")
  private String lskennung;

  @Column(name = "ELIEFPLZ")
  private String eliefplz;

  @Column(name = "AUFL_MMJJ")
  private String auflmmjj;

  @Column(name = "WAEHRUNG")
  private String waehrung;

  @Column(name = "ACCOUNTEDSHEETCOUNT")
  private Integer accountedSheetCount;

  @Column(name = "DVFREI")
  private String dvFrei;

  @Column(name = "DATAMATRIX")
  private String dataMatrix;

  @Column(name = "VTKNZ_POP")
  private String vtknzpop;

  @Column(name = "BEHNR_POP")
  private String behnrpop;

  @Column(name = "PALNR_POP")
  private String palnrpop;

  @Column(name = "BEHTYP_POP")
  private String behtyppop;

  @Column(name = "PALTYP_POP")
  private String paltyppop;

  @Column(name = "PALKZ_POP")
  private String palkzpop;

  @Column(name = "WECHSL_POP")
  private String wechslpop;

  @Column(name = "ESERNUM")
  private Long eserNum;

  @Column(name = "PRODUCTCLASSID")
  private String productClassId;

  @Column(name = "INSTID")
  private Long instId;

  @Column(name = "ESTAMPERR")
  private String estamperr;

  @Column(name = "SHIPTHICKNESS", nullable = false)
  private Integer shipThickness;

  @Column(name = "NUMDOCSPHYSINSERTS")
  private Integer numDocsPhysInserts;

  @Column(name = "NUMDOCSELECINSERTS")
  private Integer numDocSelecInserts;

  @Column(name = "NUMDOCSCOVERSHEETS")
  private Integer numDocsCoverSheets;

  @Column(name = "NUMSHEETSELECINSERTS")
  private Integer numSheetSelecInserts;

  @Column(name = "NUMSHEETSCOVERSHEETS")
  private Integer numSheetsCoverSheets;

  @Column(name = "EINSCHREIBEN_PRODKENNZEICHEN")
  private String einschreibenProdkennzeichen;

  @Column(name = "EINSCHREIBEN_PRODUKTNAME")
  private String einschreibenProduktname;

  @Column(name = "EINSCHREIBEN_PRUEFZIFFER")
  private String einschreibenPruefziffer;

  @Column(name = "EINSCHREIBEN_SENDUNGSID")
  private String einschreibenSendungsid;

  @Column(name = "FRANKIERID")
  private String frankierId;

  @Column(name = "IS_EINSCHREIBEN", nullable = false)
  private Integer isEinschreiben;

  @Column(name = "IS_EIGENHAENDIG", nullable = false)
  private Integer isEigenhaendig;

  @Column(name = "IS_EINWURF", nullable = false)
  private Integer isEinwurf;

  @Column(name = "IS_RUECKSCHEIN", nullable = false)
  private Integer isRueckschein;

  @Column(name = "IS_EIGENHAENDIG_RUECKSCHEIN", nullable = false)
  private Integer isEigenhaendigRueckschein;

  @Column(name = "IS_DIALOGPOST", nullable = false)
  private Integer isDialogPost;

  @Column(name = "IS_DIALOGPOST_EASY", nullable = false)
  private Integer isDialogPostEasy;

  @Column(name = "IS_NATIONAL", nullable = false)
  private Integer isNational;

  @Column(name = "IS_PREMIUMADRESS", nullable = false)
  private Integer isPremiumAdress;

  @Column(name = "IS_INTEGRAL", nullable = false)
  private Integer isIntegral;

  @Column(name = "IS_HYBRIDBRIEF", nullable = false)
  private Integer isHybridbrief;

  @Column(name = "RBCBIN")
  private String rbcbin;

  @Column(name = "RBCTEXT")
  private String rbctext;

}