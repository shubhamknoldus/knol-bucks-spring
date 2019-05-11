package com.knoldus.knolbucks.store;

import com.knoldus.knolbucks.model.dbModels.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryDB implements DB<User> {
    static List<User> userList = new ArrayList<User>();


    @Override
    public User getById(String id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(userList);
    }

    @Override
    public boolean store(User user) {
        return userList.add(user);
    }
}
