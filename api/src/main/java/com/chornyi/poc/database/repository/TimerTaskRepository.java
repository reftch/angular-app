package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.TimerTask;

public interface TimerTaskRepository extends JpaRepository<TimerTask, String>, JpaSpecificationExecutor<TimerTask> {

}