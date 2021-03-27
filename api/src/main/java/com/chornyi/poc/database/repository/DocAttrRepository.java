package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.DocAttr;

public interface DocAttrRepository extends JpaRepository<DocAttr, Long>, JpaSpecificationExecutor<DocAttr> {

}