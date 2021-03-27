package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ZipDE;

public interface ZipDERepository extends JpaRepository<ZipDE, Integer>, JpaSpecificationExecutor<ZipDE> {

}