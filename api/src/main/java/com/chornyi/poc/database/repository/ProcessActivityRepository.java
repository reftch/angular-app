package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ProcessActivity;

public interface ProcessActivityRepository extends JpaRepository<ProcessActivity, Long>, JpaSpecificationExecutor<ProcessActivity> {

}