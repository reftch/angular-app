package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Trigger;

public interface TriggerRepository extends JpaRepository<Trigger, String>, JpaSpecificationExecutor<Trigger> {

}