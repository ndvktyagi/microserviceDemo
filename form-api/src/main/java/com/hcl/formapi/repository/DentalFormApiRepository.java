package com.hcl.formapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.formapi.entity.bean.DentalFormApiEntity;

@Repository
public interface DentalFormApiRepository extends CrudRepository<DentalFormApiEntity, Long> {
}
