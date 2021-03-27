package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.DocsComponent;

public interface DocsComponentRepository extends JpaRepository<DocsComponent, String>, JpaSpecificationExecutor<DocsComponent> {

}