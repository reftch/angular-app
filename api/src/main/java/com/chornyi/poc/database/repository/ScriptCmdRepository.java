package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ScriptCmd;

public interface ScriptCmdRepository extends JpaRepository<ScriptCmd, String>, JpaSpecificationExecutor<ScriptCmd> {

}