package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.MailAttachment;

public interface MailAttachmentRepository extends JpaRepository<MailAttachment, Void>, JpaSpecificationExecutor<MailAttachment> {

}