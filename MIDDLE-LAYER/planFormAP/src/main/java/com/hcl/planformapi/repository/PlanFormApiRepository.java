package com.hcl.planformapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.planformapi.entity.bean.PlanFormApiEntity;

@Repository
public interface PlanFormApiRepository extends CrudRepository<PlanFormApiEntity, Long> {
}
