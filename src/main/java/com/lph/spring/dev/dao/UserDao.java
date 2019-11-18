package com.lph.spring.dev.dao;

import com.lph.spring.dev.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer>, JpaSpecificationExecutor<UserEntity> {
//    List<UserEntity> findDistinctByPhone();
//    List<Integer> findDistinctByIdcard();
//    List<String> findDistinctByEmail();
}
