package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Counter;

public interface CounterRepository extends JpaRepository<Counter, Long>, JpaSpecificationExecutor<Counter> {

}