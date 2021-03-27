package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.JobState;

public interface JobStateRepository extends JpaRepository<JobState, Long>, JpaSpecificationExecutor<JobState> {

}