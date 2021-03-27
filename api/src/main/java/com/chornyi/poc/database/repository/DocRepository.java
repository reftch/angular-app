package com.chornyi.poc.database.repository;

import com.chornyi.poc.database.domain.Doc;
import com.chornyi.poc.database.domain.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DocRepository extends JpaRepository<Doc, Long>, JpaSpecificationExecutor<Doc> {
}
