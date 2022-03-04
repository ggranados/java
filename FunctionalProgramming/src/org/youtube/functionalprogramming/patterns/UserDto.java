package org.youtube.functionalprogramming.patterns;

import java.time.LocalDate;

public class UserDto {

    private String username;
    private String fullName;
    private Boolean active;

    public UserDto(User user) {
        this.setUsername(user.getUserName());
        this.setFullName(user.getFirstName() + " " + user.getLastName());
        this.setActive(user.getDeactivationDate() == null);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", active=" + active +
                '}';
    }
}
