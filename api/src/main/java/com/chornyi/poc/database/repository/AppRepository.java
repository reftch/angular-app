package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.App;

public interface AppRepository extends JpaRepository<App, String>, JpaSpecificationExecutor<App> {

}