package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.DocponentCfg;

public interface DocponentCfgRepository extends JpaRepository<DocponentCfg, String>, JpaSpecificationExecutor<DocponentCfg> {

}