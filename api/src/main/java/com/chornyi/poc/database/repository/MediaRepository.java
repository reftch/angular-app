package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Media;

public interface MediaRepository extends JpaRepository<Media, String>, JpaSpecificationExecutor<Media> {

}