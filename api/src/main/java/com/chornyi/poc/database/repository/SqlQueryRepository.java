package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.SqlQuery;

public interface SqlQueryRepository extends JpaRepository<SqlQuery, String>, JpaSpecificationExecutor<SqlQuery> {

}