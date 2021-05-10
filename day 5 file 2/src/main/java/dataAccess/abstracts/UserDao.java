package dataAccess.abstracts;

import entity.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(User user);

    User getById(int id);

    List<User> getAll();
}
