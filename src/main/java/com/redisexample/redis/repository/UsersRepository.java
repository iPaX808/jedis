package com.redisexample.redis.repository;

import com.redisexample.redis.model.UsersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<UsersModel, Integer> {

    List<UsersModel> findAll();
}
