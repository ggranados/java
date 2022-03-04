package org.youtube.functionalprogramming.patterns;

import java.util.ArrayList;
import java.util.List;

public class UserFacade {

    private UserRepo userRepo;

    public List<UserDto> getAllUser(){
        List<User> users = userRepo.findAll();
        List<UserDto> dtos = new ArrayList<>();
        for(User user : users){
            UserDto dto = toDto(user);
            dtos.add(dto);
        }
        return dtos;
    }

    private UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getUserName());
        dto.setFullName(user.getFirstName() + " " + user.getLastName());
        dto.setActive(user.getDeactivationDate == null);
        return dto;
    }

}
