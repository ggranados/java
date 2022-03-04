package org.youtube.functionalprogramming.patterns.named_methods;

import java.util.List;
import java.util.stream.Collectors;

public class UserFacade {

    private UserRepo userRepo = new UserRepo();

    public List<UserDto> getAllUser(){
        return userRepo.findAll().stream().map(UserMapper::toDto).collect(Collectors.toList());
    }



}
