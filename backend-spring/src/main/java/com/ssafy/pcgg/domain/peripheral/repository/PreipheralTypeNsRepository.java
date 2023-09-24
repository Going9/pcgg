package com.ssafy.pcgg.domain.peripheral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.pcgg.domain.peripheral.entity.Mouse;
import com.ssafy.pcgg.domain.peripheral.entity.PeripheralTypeNs;

@Repository
public interface PreipheralTypeNsRepository extends JpaRepository<PeripheralTypeNs, String> {
	PeripheralTypeNs findByName(String typeName);
}
