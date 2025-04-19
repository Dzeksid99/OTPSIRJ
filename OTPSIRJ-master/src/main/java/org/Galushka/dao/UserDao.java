package org.Galushka.dao;

import org.Galushka.model.User;

public interface UserDao {
    void addUser(User user);
    User getUserByUsername(String username);
    void updateUser(User user);  // Добавьте эту строку

}
