package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ImportTask;

public interface ImportTaskRepository extends JpaRepository<ImportTask, String>, JpaSpecificationExecutor<ImportTask> {

}