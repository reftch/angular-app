package com.chornyi.poc.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.chornyi.poc.database.domain.ShipmentTracking;

public interface ShipmentTrackingRepository extends JpaRepository<ShipmentTracking, Long>, JpaSpecificationExecutor<ShipmentTracking> {

}