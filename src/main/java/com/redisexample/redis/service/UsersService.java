package com.redisexample.redis.service;

import com.redisexample.redis.model.UsersModel;
import com.redisexample.redis.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersModel save(UsersModel user){ return usersRepository.save(user); }

    public List<UsersModel> findAll(){
        return usersRepository.findAll();
    }
}
