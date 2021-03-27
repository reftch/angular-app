package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.WorkflowDef;

public interface WorkflowDefRepository extends JpaRepository<WorkflowDef, String>, JpaSpecificationExecutor<WorkflowDef> {

}