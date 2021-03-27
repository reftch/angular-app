package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Properties;

public interface PropertiesRepository extends JpaRepository<Properties, String>, JpaSpecificationExecutor<Properties> {

}