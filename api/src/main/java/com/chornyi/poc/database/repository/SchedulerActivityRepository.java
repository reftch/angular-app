package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.SchedulerActivity;

public interface SchedulerActivityRepository extends JpaRepository<SchedulerActivity, Long>, JpaSpecificationExecutor<SchedulerActivity> {

}