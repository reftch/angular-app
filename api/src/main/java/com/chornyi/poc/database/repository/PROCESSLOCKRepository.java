package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ProcessLock;

public interface PROCESSLOCKRepository extends JpaRepository<ProcessLock, Long>, JpaSpecificationExecutor<ProcessLock> {

}