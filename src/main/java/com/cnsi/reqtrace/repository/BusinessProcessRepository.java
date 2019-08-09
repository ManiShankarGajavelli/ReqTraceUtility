package com.cnsi.reqtrace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnsi.reqtrace.model.domain.BusinessProcess;

public interface BusinessProcessRepository extends JpaRepository<BusinessProcess, Long>{

}
