package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Pages;

public interface PagesRepository extends JpaRepository<Pages, Long>, JpaSpecificationExecutor<Pages> {

}