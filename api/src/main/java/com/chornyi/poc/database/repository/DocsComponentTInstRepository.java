package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.DocsComponentInst;

public interface DocsComponentTInstRepository extends JpaRepository<DocsComponentInst, Long>, JpaSpecificationExecutor<DocsComponentInst> {

}