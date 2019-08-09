package com.cnsi.reqtrace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnsi.reqtrace.model.domain.DomainlookupValue;

public interface DomainLookupValueRepository extends JpaRepository<DomainlookupValue,Long >{

}
