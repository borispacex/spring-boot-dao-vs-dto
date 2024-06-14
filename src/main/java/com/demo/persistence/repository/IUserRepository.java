package com.demo.persistence.repository;

import com.demo.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity, Long> {
}
