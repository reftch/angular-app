package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.MediaInst;

public interface MediaInstRepository extends JpaRepository<MediaInst, Long>, JpaSpecificationExecutor<MediaInst> {

}