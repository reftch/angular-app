package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.MailCC;

public interface MailCCRepository extends JpaRepository<MailCC, Void>, JpaSpecificationExecutor<MailCC> {

}