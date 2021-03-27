package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.EnvelopeFormat;

public interface EnvelopeFormatRepository extends JpaRepository<EnvelopeFormat, String>, JpaSpecificationExecutor<EnvelopeFormat> {

}