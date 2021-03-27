package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.Mail;

public interface MailRepository extends JpaRepository<Mail, String>, JpaSpecificationExecutor<Mail> {

}