package org.youtube.functionalprogramming.patterns;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        users.add(new User("ggranados","Guille", "Granados"));
        users.add(new User("natynim","Nati", "Iribarren"));
        users.add(new User("uva","Uverlinda", "Iribarren"));
        users.add(new User("viejo","Pancho", "Hermosilla"));

        return users;
    }
}
