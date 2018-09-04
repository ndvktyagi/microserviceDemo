package com.hcl.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.student.entity.bean.StudentRegistrationEntity;

@Repository
public interface StudentRegistrationRepository extends CrudRepository<StudentRegistrationEntity, Long> {
}
