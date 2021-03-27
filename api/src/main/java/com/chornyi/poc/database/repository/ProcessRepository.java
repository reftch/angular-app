package com.chornyi.poc.database.repository;

import com.chornyi.poc.database.domain.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long> {

    Optional<Process> findOneByProcessId(String processId);

}
