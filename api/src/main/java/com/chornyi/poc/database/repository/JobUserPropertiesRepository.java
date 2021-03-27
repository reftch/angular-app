package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.JobUserProperties;

public interface JobUserPropertiesRepository extends JpaRepository<JobUserProperties, Long>, JpaSpecificationExecutor<JobUserProperties> {

}