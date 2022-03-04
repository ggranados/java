package org.youtube.functionalprogramming.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserFacade {

    private UserRepo userRepo = new UserRepo();

    public List<UserDto> getAllUser(){
        return userRepo.findAll().stream().map(UserDto::new).collect(Collectors.toList());
    }



}
