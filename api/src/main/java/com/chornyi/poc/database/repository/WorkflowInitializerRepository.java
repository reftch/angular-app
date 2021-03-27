package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.WorkflowInitializer;

public interface WorkflowInitializerRepository extends JpaRepository<WorkflowInitializer, String>, JpaSpecificationExecutor<WorkflowInitializer> {

}