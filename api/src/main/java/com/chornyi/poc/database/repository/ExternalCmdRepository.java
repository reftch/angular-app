package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ExternalCmd;

public interface ExternalCmdRepository extends JpaRepository<ExternalCmd, String>, JpaSpecificationExecutor<ExternalCmd> {

}