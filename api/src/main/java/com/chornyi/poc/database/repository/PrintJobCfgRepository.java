package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.PrintJobCfg;

public interface PrintJobCfgRepository extends JpaRepository<PrintJobCfg, String>, JpaSpecificationExecutor<PrintJobCfg> {

}