package org.youtube.functionalprogramming.patterns.named_methods;

public class UserMapper {

    public static UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getUserName());
        dto.setFullName(user.getFirstName() + " " + user.getLastName());
        dto.setActive(user.getDeactivationDate() == null);
        return dto;
    }

}