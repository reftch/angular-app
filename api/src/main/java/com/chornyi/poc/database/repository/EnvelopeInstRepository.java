package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.EnvelopeInst;

public interface EnvelopeInstRepository extends JpaRepository<EnvelopeInst, Long>, JpaSpecificationExecutor<EnvelopeInst> {

}